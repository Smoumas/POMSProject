	package poms.center.controller;

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

import poms.center.entity.Company;
import poms.center.entity.DepartmentDuty;
import poms.center.entity.Order;
import poms.center.entity.OrderCount;
import poms.center.service.ICenterOrderService;
import poms.center.service.ICenterQueryService;
import poms.center.service.ICenterSummaryService;

@Controller
@RequestMapping("/center/query")
@SessionAttributes({ "stationID", "departmentID", "operator" })
public class CenterQueryController {

	@Autowired
	private ICenterQueryService centerQueryService;

	@Autowired
	private ICenterSummaryService centerSummaryService;

	@Autowired
	private ICenterOrderService centerOrderService;

	
	@RequestMapping(value = "/customerPeriodOrderList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> customerPeriodOrderList(@RequestParam("customerID") int customerID,
			@RequestParam("beginDate") Date beginDate, @RequestParam("endDate") Date endDate,
			@RequestParam("page") int page, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		List<Order> orderList = centerQueryService.selectCustomerPeriodOrder(stationID, customerID, beginDate, endDate,
				page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", orderList.size());
		resultMap.put("data", orderList);
		return resultMap;
	}

	@RequestMapping(value = "/orderListByNewspaperName", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> orderListByNewspaperName(@RequestParam("newspaperName") String newspaperName,
			@RequestParam("page") int page, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		List<Order> orderList = centerQueryService.selectOrderListByNewspaperName(stationID, newspaperName, page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", orderList.size());
		resultMap.put("data", orderList);
		return resultMap;
	}

	@RequestMapping(value = "/orderListByCustomerName", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> orderListByCustomerName(@RequestParam("customerName") String customerName,
			@RequestParam("page") int page, ModelMap map) {
		int staionID = (Integer) map.get("stationID");
		List<Order> orderList = centerQueryService.selectOrderListByCustomerName(staionID, customerName, page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", orderList.size());
		resultMap.put("data", orderList);
		return resultMap;
	}

	@RequestMapping(value = "/orderCountList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> orderCountList(@RequestParam(value="page",defaultValue="0") int page) {
		List<OrderCount> orderCountList = centerSummaryService.orderCountListGroupByStation(page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", orderCountList.size());
		resultMap.put("data", orderCountList);
		return resultMap;
	}

	@RequestMapping(value = "/companyInfo", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> companyInfo() {
		List<Company> companyInfo = centerQueryService.selectCompanyInfo();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", companyInfo.size());
		resultMap.put("data", companyInfo);
		return resultMap;
	}

	@RequestMapping(value = "/departmentDutyInfo", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> departmentDutyInfo(@RequestParam(value="page",defaultValue="0") int page) {
		List<DepartmentDuty> dutyList = centerQueryService.selectDepartmentDutyInfo(page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", dutyList.size());
		resultMap.put("data", dutyList);
		return resultMap;
	}
	
	@RequestMapping(value = "/departmentDutyInfoByName", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> departmentDutyInfo(@RequestParam("departmentName")String departmentName,@RequestParam(value="page",defaultValue="0") int page) {
		List<DepartmentDuty> dutyList = centerQueryService.selectDepartmentDutyInfoByName(departmentName,page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", dutyList.size());
		resultMap.put("data", dutyList);
		return resultMap;
	}
	

	@RequestMapping(value = "/orderCountByDate", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> orderCountByDate(@RequestParam("date") Date date,@RequestParam(value="page",defaultValue="0")int page) {
		List<OrderCount> orderCountList = centerOrderService.selectOrderCountGroupByStationAndDate(date,page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", orderCountList.size());
		resultMap.put("data", orderCountList);
		return resultMap;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
}
