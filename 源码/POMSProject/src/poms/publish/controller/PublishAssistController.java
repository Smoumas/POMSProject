package poms.publish.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import poms.center.entity.Operator;
import poms.center.entity.Station;
import poms.publish.service.IPublishAssistService;

@Controller
@RequestMapping("/publish/assist")
@SessionAttributes({ "stationID", "departmentID", "operator" })
public class PublishAssistController {

	@Autowired
	private IPublishAssistService publishAssistService;

	
	@RequestMapping(value="/setAdviceReaded",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> setAdiceReaded(@RequestParam("adviceID")int adviceID){
		int result = publishAssistService.setAdviceReaded(adviceID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	
	
	@RequestMapping(value = "/adviceList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> unreadedAdviceList(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam("isReaded") int isReaded, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		int departmentID = (Integer) map.get("departmentID");
		List<Advice> adviceList = publishAssistService.getadviceList(stationID, departmentID,isReaded,page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", adviceList.size());
		resultMap.put("data", adviceList);
		return resultMap;
	}

	@RequestMapping(value = "/sendAdvice", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> sendAdvice(Advice advice) {
		advice.setSendDate(new Date());
		int result = publishAssistService.sendAdvice(advice);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/readedAdviceList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> readedAdviceList(@RequestParam(value = "page", defaultValue = "0") int page,
			ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		int departmentID = (Integer) map.get("departmentID");
		List<Advice> adviceList = publishAssistService.getReadedAdvice(stationID, departmentID, page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", adviceList.size());
		resultMap.put("data", adviceList);
		return resultMap;
	}

	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> changePassword(@RequestParam("newPassword") String newPassword, ModelMap map) {
		Operator operator = (Operator) map.get("operator");
		int result = publishAssistService.changePassword(operator, newPassword);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value = "/departmentList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> departmentList(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "stationID", defaultValue = "-1") int stationID,ModelMap map) {
		if (stationID == -1) {
			stationID = (Integer) map.get("stationID");
		}
		List<Department> departmentList = publishAssistService.selectDepartmentList(stationID, page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", departmentList.size());
		resultMap.put("data", departmentList);
		return resultMap;
	}
	
	@RequestMapping(value = "/stationList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> stationList(@RequestParam(value = "page", defaultValue = "0") int page) {
		List<Station> stationList = publishAssistService.stationList(page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", stationList.size());
		resultMap.put("data", stationList);
		return resultMap;
	}
	
}
