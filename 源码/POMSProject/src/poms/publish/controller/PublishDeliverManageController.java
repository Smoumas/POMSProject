package poms.publish.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.DeliverArea;
import poms.center.entity.Order;
import poms.publish.service.IPublishDeliverManageService;

@Controller
@RequestMapping("/publish/deliverManage")
@SessionAttributes({"stationID","departmentID","operator"})
public class PublishDeliverManageController {

	@Autowired
	private IPublishDeliverManageService publishDeliverManageService;
	
	@RequestMapping(value="/getDeliverArea",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getDeliverArea(@RequestParam("orderID") int orderID,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<DeliverArea> deliverAreaList = publishDeliverManageService.getDeliverArea(stationID,orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", deliverAreaList.size());
		resultMap.put("data", deliverAreaList);
		return resultMap;
	}
	
	@RequestMapping(value="/getOrderByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getOrderByID(@RequestParam("orderID") int orderID,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Order> orderList = publishDeliverManageService.getOrderByID(stationID,orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", orderList.size());
		resultMap.put("data", orderList);
		return resultMap;
	}
	
	@RequestMapping(value="/getOrderCount",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getOrderCount(@RequestParam("date")Date date,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		int data = publishDeliverManageService.getOrderCount(date,stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", data);
		return resultMap;
	}
	
	@RequestMapping(value="/finishDeliver",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> finishDeliver(@RequestParam("orderID") int orderID,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		int result = publishDeliverManageService.finishDeliver(stationID,orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/correctAddress",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> correctAddress(@RequestParam("orderID") int orderID,@RequestParam("correctAddress") String correctAddress,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		int result = publishDeliverManageService.correctAddress(stationID,orderID, correctAddress);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
}
