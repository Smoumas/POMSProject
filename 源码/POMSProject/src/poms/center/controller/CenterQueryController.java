package poms.center.controller;

import java.util.Date;
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

import poms.center.entity.Order;
import poms.center.service.ICenterQueryService;

@Controller
@RequestMapping("/center/query")
public class CenterQueryController {

	@Autowired
	private ICenterQueryService centerQueryService;

	@RequestMapping(value = "/customerPeriodOrderList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> customerPeriodOrderList(@RequestParam("customerID") int customerID,
			@RequestParam("beginDate") Date beginDate, @RequestParam("endDate") Date endDate, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		List<Order> orderList = centerQueryService.selectCustomerPeriodOrder(stationID, customerID, beginDate, endDate);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", orderList.size());
		resultMap.put("data", orderList);
		return resultMap;
	}

	@RequestMapping(value = "/orderListByNewspaperName", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> orderListByNewspaperName(@RequestParam("newspaperName") String newspaperName,
			ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		List<Order> orderList = centerQueryService.selectOrderListByNewspaperName(stationID, newspaperName);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", orderList.size());
		resultMap.put("data", orderList);
		return resultMap;
	}

	@RequestMapping(value = "/orderListByCustomerName", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> orderListByCustomerName(@RequestParam("customerName") String customerName,
			ModelMap map) {
		int staionID = (Integer) map.get("stationID");
		List<Order> orderList = centerQueryService.selectOrderListByCustomerName(staionID, customerName);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", orderList.size());
		resultMap.put("data", orderList);
		return resultMap;
	}
}
