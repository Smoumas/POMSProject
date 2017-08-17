package poms.finance.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sakamichi on 2017/8/7.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.Advice;
import poms.center.entity.Department;
import poms.center.entity.Duty;
import poms.center.entity.Operator;
import poms.center.entity.Station;
import poms.finance.service.AssistantService;

@Controller
@RequestMapping("/finance/assist")
@SessionAttributes({ "stationID", "departmentID", "operator" })
public class AssistantController {
	@Autowired
	private AssistantService assistantService;

	@RequestMapping(value = "/unreadedAdvice", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getUnreadedAdvice(@RequestParam(value = "page", defaultValue = "0") int page,
			ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		int departmentID = (Integer) map.get("departmentID");
		List<Advice> unreadedAdviceList = assistantService.getUnreadedAdvice(stationID, departmentID, page);
		Map<String, Object> modelMap = new HashMap<>();
		modelMap.put("size", unreadedAdviceList.size());
		modelMap.put("data", unreadedAdviceList);
		return modelMap;
	}

	@RequestMapping(value = "/sendAdvice", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> sendService(Advice advice, ModelMap map) {
		// System.out.println(map.get("stationID"));
		int result = assistantService.sendAdvice(advice);
		Map<String, Object> modelMap = new HashMap<>();
		modelMap.put("result", result);
		return modelMap;
	}

	@RequestMapping(value = "/readedAdvice", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getReadedAdvice(@RequestParam(value = "page", defaultValue = "0") int page,
			ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		int departmentID = (Integer) map.get("departmentID");
		List<Advice> readedAdviceList = assistantService.getReadedAdvice(stationID, departmentID, page);
		Map<String, Object> modelMap = new HashMap<>();
		modelMap.put("size", readedAdviceList.size());
		modelMap.put("data", readedAdviceList);
		return modelMap;
	}

	@RequestMapping(value = "/adviceList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> adviceList(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam("isReaded") int isReaded, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		int departmentID = (Integer) map.get("departmentID");
		List<Advice> readedAdviceList = assistantService.getadviceList(stationID, departmentID, isReaded, page);
		Map<String, Object> modelMap = new HashMap<>();
		modelMap.put("size", readedAdviceList.size());
		modelMap.put("data", readedAdviceList);
		return modelMap;
	}

	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> changePassword(@RequestParam("newPassword") String newPassword, ModelMap map) {
		int operatorID = ((Operator)map.get("operator")).getOperatorID();
		int result = assistantService.changePassword(operatorID, newPassword);
		Map<String, Object> modelMap = new HashMap<>();
		modelMap.put("result", result);
		return modelMap;
	}

	@RequestMapping(value = "/departmentList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> departmentList(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "stationID", defaultValue = "-1") int stationID, ModelMap map) {
		if (stationID == -1) {
			stationID = (Integer) map.get("stationID");
		}
		List<Department> departmentList = assistantService.selectDepartmentList(stationID, page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", departmentList.size());
		resultMap.put("data", departmentList);
		return resultMap;
	}

	@RequestMapping(value = "/stationList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> stationList(@RequestParam(value = "page", defaultValue = "0") int page) {
		List<Station> stationList = assistantService.stationList(page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", stationList.size());
		resultMap.put("data", stationList);
		return resultMap;
	}

	@RequestMapping(value = "/dutyList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> dutyList(@RequestParam(value = "page", defaultValue = "0") int page, ModelMap map) {
		int departmentID = (Integer) map.get("departmentID");
		List<Duty> dutyList = assistantService.selectDutyList(departmentID, page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", dutyList.size());
		resultMap.put("data", dutyList);
		return resultMap;
	}
	
	@RequestMapping(value="/setAdviceReaded",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> setAdiceReaded(@RequestParam("adviceID")int adviceID){
		int result = assistantService.setAdviceReaded(adviceID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	

}
