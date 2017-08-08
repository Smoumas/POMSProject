package poms.publish.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import poms.center.entity.Coupon;
import poms.center.entity.GiftCard;
import poms.center.entity.Order;
import poms.publish.service.IPublishProductOrderService;

@Controller
@RequestMapping("/publish/productOrder")
public class PublishProductOrderController {

	@Autowired
	private IPublishProductOrderService publishProductOrderService;

	@RequestMapping(value="/newOrder",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> newOrder(Order order){
		int result = publishProductOrderService.newOrder(order);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteOrder",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteOrder(@RequestParam("orderID") int orderID){
		int result = publishProductOrderService.deleteOrder(orderID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/changeAddress",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> changeAddress(@RequestParam("orderID") int orderID,@RequestParam("newAddress") String newAddress){
		int result = publishProductOrderService.changeAddress(orderID, newAddress);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/postpone",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> postpone(@RequestParam("orderID") int orderID,@RequestParam("postponeDate") Date postponeDate){
		int result = publishProductOrderService.postpone(orderID, postponeDate);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/renewSubscription",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> renewSubscription(Order order){
		int result = publishProductOrderService.renewSubscription(order);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/additionalDonationByGiftCard",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> additionalDonationByGiftCard(@RequestParam("newspaperID") int newspaperID){
		GiftCard giftCard = publishProductOrderService.additionalDonationByGiftCard(newspaperID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", giftCard);
		return resultMap;
	}
	
	@RequestMapping(value="/additionalDonationByCoupon",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> additionalDonationByCoupon(){
		Coupon coupon = publishProductOrderService.additionalDonationByCoupon();
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", coupon);
		return resultMap;
	}
}
