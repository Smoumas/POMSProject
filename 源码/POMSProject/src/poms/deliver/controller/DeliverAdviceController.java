package poms.deliver.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.constants.CommonConstants;
import poms.center.entity.Advice;
import poms.center.entity.Department;
import poms.center.entity.Station;
import poms.deliver.service.IDeliverAdviceService;

@Controller
@RequestMapping("/deliver/advice")
@SessionAttributes({"stationID","departmentID","operator"})
public class DeliverAdviceController {

	@Resource
	private IDeliverAdviceService deliverAdviceService;

	@RequestMapping(value = "/adviceList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getAdviceUnReaded(@RequestParam("isReaded") int isReaded,@RequestParam(value="page",defaultValue="0") int page,ModelMap modelMap) {
		int receiveStationID = (int) modelMap.get("stationID");
		int receiveDeptID = (int)modelMap.get("departmentID");
		List<Advice> list = this.deliverAdviceService.selectAdviceList(receiveStationID,receiveDeptID,isReaded,page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", list.size());
		map.put("data", list);
		return map;
	}

	@RequestMapping(value = "/sendAdvice", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> sendAdvice(Advice advice, ModelMap modelMap) {
		int stationID=(int) modelMap.get("stationID");
		int deptID=(int) modelMap.get("departmentID");
		advice.setSendStationID(stationID);
		advice.setSendDeptID(deptID);
		advice.setSendDate(new Date());
		int state =this.deliverAdviceService.insertAdvice(advice);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if(state!=1){
			map.put("error", "通知发送失败");
		}
		return map;
	}

	@RequestMapping(value="/setAdviceReaded",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> setAdiceReaded(@RequestParam("adviceID")int adviceID){
		int result = this.deliverAdviceService.setAdviceReaded(adviceID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value = "/stationList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> stationList(@RequestParam(value = "page", defaultValue = "0") int page) {
		List<Station> stationList = this.deliverAdviceService.stationList(page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", stationList.size());
		resultMap.put("data", stationList);
		return resultMap;
	}
	
	@RequestMapping(value = "/departmentList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> departmentList(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "stationID", defaultValue = "-1") int stationID,ModelMap map) {
		if (stationID == -1) {
			stationID = (Integer) map.get("stationID");
		}
		List<Department> departmentList = this.deliverAdviceService.selectDepartmentList(stationID, page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", departmentList.size());
		resultMap.put("data", departmentList);
		return resultMap;
	}
	
	
}
