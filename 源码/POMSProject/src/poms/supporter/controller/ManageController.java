package poms.supporter.controller;
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
import poms.center.entity.Customer;
import poms.supporter.service.IManageService;

@Controller
@RequestMapping("/support/manage")
@SessionAttributes("stationID")
public class ManageController {
	
	@Autowired
	private IManageService manageService;

	@RequestMapping(value="/updateCustomer")
	@ResponseBody
	public Map<String,Object> updateCustomer(Customer customer){
		int result = manageService.updateCustomer(customer);
		Map<String,Object> modelMap = new HashMap<String, Object>();
		modelMap.put("result", result);
		return modelMap;
	}
	
	@RequestMapping(value="/deleteCustomer")
	@ResponseBody
	public Map<String,Object> deleteCustomer(@RequestParam("customerID") int customerID){
		int result = manageService.deleteCustomer(customerID);
//		System.out.println("customerID:"+customerID);
		Map<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("result", result);
		return modelMap;
	}
	
	@RequestMapping(value="/insertNewCustomer",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertNewCustomer(Customer customer){
		int result = manageService.insertNewCustomer(customer);
		Map<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("result", result);
		return modelMap;
	}
	
	@RequestMapping(value="/setInvestigation",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> setCustomerInvestigation(Comment comment){
		int result = manageService.setCustomerInvestigation(comment);
		Map<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("result", result);
		return modelMap;
	}
	
	@RequestMapping(value="/allInvestigation")
	@ResponseBody
	public Map<String,Object> selectAllInvestigation(ModelMap map){
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Comment> commentList = manageService.selectAllInvestigation(stationID);
		Map<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("size", commentList.size());
		modelMap.put("data", commentList);
		return modelMap;
	}
	
	@RequestMapping(value="/changePassword")
	@ResponseBody
	public Map<String,Object> changePassword(@RequestParam("newPassword")String newPassword,ModelMap map){
//		int operatorID = ((Operator)map.get("operator")).getOperatorID();
		int operatorID = 1;
		int result = manageService.changePassword(operatorID, newPassword);
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/investigationByType")
	@ResponseBody
	public Map<String,Object> selectInvestigationByType(@RequestParam("commentType") int commentType,ModelMap map){
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Comment> commentList = manageService.selectInvestigationByType(stationID, commentType);
		Map<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("size", commentList.size());
		modelMap.put("data", commentList);
		return modelMap;
	}
	
	@RequestMapping(value="customerList")
	@ResponseBody
	public Map<String,Object> customerList(ModelMap map){
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Customer> customerList = manageService.selectCustomerList(stationID);
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("size", customerList.size());
		resultMap.put("data", customerList);
		return resultMap;
	}
}
