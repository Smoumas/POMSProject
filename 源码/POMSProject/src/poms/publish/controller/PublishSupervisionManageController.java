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
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.Comment;
import poms.publish.service.IPublishSupervisionManageService;

@Controller
@RequestMapping("/publish/supervisionManage")
@SessionAttributes({"stationID","departmentID","operator"})
public class PublishSupervisionManageController {
	
	@Autowired
	private IPublishSupervisionManageService publishSupervisionManageService;

	@RequestMapping(value="/complaintList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> complaintList(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Comment> complaintList = publishSupervisionManageService.selectComplaint(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", complaintList.size());
		resultMap.put("data", complaintList);
		return resultMap;
	}
	
	@RequestMapping(value="/complaintByCustomerID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> complaintByCustomerID(@RequestParam("customerID") int customerID,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Comment> complaintList = publishSupervisionManageService.selectComplaintByCustomerID(stationID, customerID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", complaintList.size());
		resultMap.put("data", complaintList);
		return resultMap;
	}
	
	@RequestMapping(value="/insertReceipt",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertReceipt(@RequestParam("recordID") int recordID, @RequestParam("receipt") String receipt,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		int result = publishSupervisionManageService.insertReceipt(stationID,recordID, receipt);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/praiseList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> praiseList(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Comment> praiseList = publishSupervisionManageService.selectPraise(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", praiseList.size());
		resultMap.put("data", praiseList);
		return resultMap;
	}
	
	@RequestMapping(value="/suggestionList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> suggestionList(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Comment> suggestionList = publishSupervisionManageService.selectSuggesion(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", suggestionList.size());
		resultMap.put("data", suggestionList);
		return resultMap;
	}
}
