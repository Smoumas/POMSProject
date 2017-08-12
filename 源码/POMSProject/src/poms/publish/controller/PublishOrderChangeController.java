package poms.publish.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	public Map<String,Object> cancelDeleteOrder(@RequestParam("orderID") int orderID,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		int result = publishOrderChangeService.cancelDeleteOrder(stationID,orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/cancelChangeAddress",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> cancelChangeAddress(@RequestParam("orderID") int orderID,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		int result = publishOrderChangeService.cancelChangeAddress(stationID,orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/cancelPostpone",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> cancelPostpone(@RequestParam("orderID") int orderID,ModelMap map) throws ParseException{
		int stationID = (Integer)map.get("stationID");
		int result = publishOrderChangeService.cancelPostpone(stationID,orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
}
