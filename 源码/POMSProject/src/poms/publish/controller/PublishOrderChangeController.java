package poms.publish.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import poms.publish.service.IPublishOrderChangeService;

@Controller
@RequestMapping("/publish/orderChange")
public class PublishOrderChangeController {

	@Autowired
	private IPublishOrderChangeService publishOrderChangeService;

	@RequestMapping(value="/cancelDeleteOrder",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> cancelDeleteOrder(@RequestParam("orderID") int orderID){
		int result = publishOrderChangeService.cancelDeleteOrder(orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/cancelChangeAddress",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> cancelChangeAddress(@RequestParam("orderID") int orderID){
		int result = publishOrderChangeService.cancelChangeAddress(orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/cancelPostpone",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> cancelPostpone(@RequestParam("orderID") int orderID){
		int result = publishOrderChangeService.cancelPostpone(orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
}
