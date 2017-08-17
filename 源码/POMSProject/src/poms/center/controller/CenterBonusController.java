package poms.center.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.Coupon;
import poms.center.entity.GiftCard;
import poms.center.service.ICenterBonusService;

@Controller
@RequestMapping("/center/bonus")
@SessionAttributes({"stationID","departmentID","operator"})
public class CenterBonusController {
	
	@Autowired
	private ICenterBonusService centerBonusService;

	@RequestMapping(value="/insertGiftCard",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertGiftCard(GiftCard giftCard){
		int result = centerBonusService.insertGiftCard(giftCard);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateGiftCard",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateGiftCard(GiftCard giftCard){
		int result = centerBonusService.updateGiftCard(giftCard);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteGiftCard",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteGiftCard(@RequestParam("giftCardID") int giftCardID){
		int result = centerBonusService.deleteGiftCard(giftCardID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/giftCardList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> giftCardList(@RequestParam(value="page",defaultValue="0") int page){
		List<GiftCard> giftCardList = centerBonusService.selectGiftCardList(page);
		Map<String,Object> resultMap = new  HashMap<String, Object>();
		resultMap.put("size", giftCardList.size());
		resultMap.put("data", giftCardList);
		return resultMap;
	}
	
	@RequestMapping(value="/giftCardByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> giftCardByID(@RequestParam("giftCardID") int giftCardID){
		List<GiftCard> giftCardList = centerBonusService.selectGiftCardByID(giftCardID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", giftCardList.size());
		resultMap.put("data", giftCardList);
		return resultMap;
	}
	
	@RequestMapping(value="/insertCoupon",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertCoupon(Coupon coupon){
		int result = centerBonusService.insertCoupon(coupon);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateCoupon",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateCoupon(Coupon coupon){
		int result = centerBonusService.updateCoupon(coupon);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteCoupon",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteCoupon(@RequestParam("couponID") int couponID){
		int result = centerBonusService.deleteCoupon(couponID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/couponList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> couponList(@RequestParam(value="page",defaultValue="0") int page){
		List<Coupon> couponList = centerBonusService.selectCouponList(page);
		Map<String,Object> resultMap = new  HashMap<String, Object>();
		resultMap.put("size", couponList.size());
		resultMap.put("data", couponList);
		return resultMap;
	}
	
	@RequestMapping(value="/couponByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> couponByID(@RequestParam("couponID") int couponID){
		List<Coupon> couponList = centerBonusService.selectCouponByID(couponID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
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
