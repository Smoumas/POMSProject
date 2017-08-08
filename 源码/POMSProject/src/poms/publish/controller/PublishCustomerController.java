package poms.publish.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import poms.center.entity.Customer;
import poms.publish.service.IPublishCustomerService;

@Controller
@RequestMapping("/publish/customer")
public class PublishCustomerController {
	
	@Autowired
	private IPublishCustomerService publishCustomerService;

	@RequestMapping(value="/customerRegister",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> customerRegister(Customer customer){
		int result = publishCustomerService.customerRegister(customer);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/customerList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> customerList(ModelMap map){
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Customer> customerList = publishCustomerService.selectCustomer(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", customerList.size());
		resultMap.put("data", customerList);
		return resultMap;
	}
}
