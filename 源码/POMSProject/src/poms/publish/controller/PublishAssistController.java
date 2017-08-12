package poms.publish.controller;

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

import poms.center.entity.Advice;
import poms.center.entity.Operator;
import poms.publish.service.IPublishAssistService;

@Controller
@RequestMapping("/publish/assist")
public class PublishAssistController {

	@Autowired
	private IPublishAssistService publishAssistService;
	
	@RequestMapping(value="/unreadedAdviceList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> unreadedAdviceList(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		int departmentID = (Integer)map.get("departmentID");
		List<Advice> adviceList = publishAssistService.getUnreadedAdvice(stationID,departmentID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", adviceList.size());
		resultMap.put("data", adviceList);
		return resultMap;
	}
	
	
	@RequestMapping(value="/sendAdvice",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> sendAdvice(Advice advice){
		int result = publishAssistService.sendAdvice(advice);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/readedAdviceList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> readedAdviceList(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		int departmentID = (Integer)map.get("departmentID");
		List<Advice> adviceList = publishAssistService.getReadedAdvice(stationID,departmentID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", adviceList.size());
		resultMap.put("data", adviceList);
		return resultMap;
	}
	
	@RequestMapping(value="/changePassword",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> changePassword(@RequestParam("newPassowrd")String newPassword,ModelMap map){
		int operatorID = ((Operator)map.get("operator")).getOperatorID();
		int result = publishAssistService.changePassword(operatorID, newPassword);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
}
