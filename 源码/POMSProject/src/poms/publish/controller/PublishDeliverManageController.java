package poms.publish.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import poms.center.entity.DeliverArea;
import poms.center.entity.Order;
import poms.publish.service.IPublishDeliverManageService;

@Controller
@RequestMapping("/publish/deliverManage")
public class PublishDeliverManageController {

	@Autowired
	private IPublishDeliverManageService publishDeliverManageService;
	
	@RequestMapping(value="/getDeliverArea",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getDeliverArea(@RequestParam("orderID") int orderID){
		DeliverArea deliverArea = publishDeliverManageService.getDeliverArea(orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", deliverArea);
		return resultMap;
	}
	
	@RequestMapping(value="/getOrderByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getOrderByID(@RequestParam("orderID") int orderID){
		Order order = publishDeliverManageService.getOrderByID(orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", order);
		return resultMap;
	}
	
	@RequestMapping(value="/getOrderCount",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getOrderCount(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		int data = publishDeliverManageService.getOrderCount(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", data);
		return resultMap;
	}
	
	@RequestMapping(value="/finishDeliver",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> finishDeliver(@RequestParam("orderID") int orderID){
		int result = publishDeliverManageService.finishDeliver(orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/correctAddress",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> correctAddress(@RequestParam("orderID") int orderID,@RequestParam("correctAddress") String correctAddress){
		int result = publishDeliverManageService.correctAddress(orderID, correctAddress);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
}
