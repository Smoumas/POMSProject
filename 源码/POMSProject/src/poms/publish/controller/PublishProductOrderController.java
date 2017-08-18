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

import poms.center.entity.Coupon;
import poms.center.entity.GiftCard;
import poms.center.entity.Order;
import poms.publish.service.IPublishProductOrderService;

@Controller
@RequestMapping("/publish/productOrder")
@SessionAttributes({ "stationID", "departmentID", "operator" })
public class PublishProductOrderController {

	@Autowired
	private IPublishProductOrderService publishProductOrderService;

	@RequestMapping(value = "/newOrder", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> newOrder(Order order, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		order.setStationID(stationID);
		order.setDeliverDate(new Date());
		order.setOrderDate(new Date());
		int result = publishProductOrderService.newOrder(order);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/deleteOrder", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deleteOrder(@RequestParam("orderID") int orderID, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		int result = publishProductOrderService.deleteOrder(stationID, orderID);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/changeAddress", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> changeAddress(@RequestParam("orderID") int orderID,
			@RequestParam("newAddress") String newAddress, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		int result = publishProductOrderService.changeAddress(stationID, orderID, newAddress);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/postpone", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> postpone(@RequestParam("orderID") int orderID,
			@RequestParam("postponeDate") Date postponeDate, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		int result = publishProductOrderService.postpone(stationID, orderID, postponeDate);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/renewSubscription", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> renewSubscription(@RequestParam("orderID") int orderID,
			@RequestParam("orderKeepTime") int orderKeepTime, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		int result = publishProductOrderService.renewSubscription(stationID, orderID,orderKeepTime);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/additionalDonationByGiftCard", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> additionalDonationByGiftCard(@RequestParam("newspaperID") int newspaperID) {
		List<GiftCard> giftCardList = publishProductOrderService.additionalDonationByGiftCard(newspaperID);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", giftCardList.size());
		resultMap.put("data", giftCardList);
		return resultMap;
	}
	
	@RequestMapping(value="/orderList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> orderList(@RequestParam(value="page",defaultValue="0")int page,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Order> orderList = publishProductOrderService.orderList(stationID, page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size",orderList.size());
		resultMap.put("data", orderList);
		return resultMap;
	}

	@RequestMapping(value = "/additionalDonationByCoupon", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> additionalDonationByCoupon() {
		List<Coupon> couponList = publishProductOrderService.additionalDonationByCoupon();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", couponList.size());
		resultMap.put("data", couponList);
		return resultMap;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
}
