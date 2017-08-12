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

import poms.center.entity.Customer;
import poms.center.entity.Invoice;
import poms.center.entity.Log;
import poms.center.entity.NewspaperPrice;
import poms.center.entity.Order;
import poms.center.entity.PromptOrder;
import poms.publish.service.IPublishQueryService;

@Controller
@RequestMapping("/publish/query")
public class PublishQueryController {
	
	@Autowired
	private IPublishQueryService publishQueryService;
	
	@RequestMapping(value="/form2",method=RequestMethod.GET)
	public String form2(){
		return "form2";
	}
	
	
	@RequestMapping(value="/periodInvoiceList",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> periodInvoiceList(@RequestParam("beginDate")Date beginDate,@RequestParam("endDate")Date endDate,ModelMap map){
//		int stationID = Integer.parseInt(map.get("stationID").toString());
		int stationID = 1;
		List<Invoice> invoiceList = publishQueryService.selectInvoiceByDate(beginDate, endDate, stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size",invoiceList.size());
		resultMap.put("data", invoiceList);
		return resultMap;
	}
	
	@RequestMapping(value="/receiptList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> receiptList(ModelMap map){	//分站收款情况列表
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Order> receiptList = publishQueryService.selectReceiptList(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", receiptList.size());
		resultMap.put("data", receiptList);
		return resultMap;
	}
	
	@RequestMapping(value="/refundList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> refundList(ModelMap map){		//分站退款情况
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Order> refundList = publishQueryService.selectRefundList(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", refundList.size());
		resultMap.put("data", refundList);
		return resultMap;
	}
	
	@RequestMapping(value="/deliverOrderList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deliverOrderList(ModelMap map){	//分站投递单情况
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Order> deliverOrderList = publishQueryService.selectDeliverOrder(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size",deliverOrderList.size());
		resultMap.put("data", deliverOrderList);
		return resultMap;
	}
	
	@RequestMapping(value="/getNewspaperPriceByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getNewspaperPriceByID(@RequestParam("newspaperID") int newspaperID){
		List<NewspaperPrice> newspaperPriceList = publishQueryService.getNewspaperPriceByID(newspaperID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", newspaperPriceList.size());
		resultMap.put("data", newspaperPriceList);
		return resultMap;
	}
	
	@RequestMapping(value="/customerList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> customerList(ModelMap map){	//分站客户列表
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Customer> customerList = publishQueryService.getStationCustomer(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", customerList.size());
		resultMap.put("data", customerList);
		return resultMap;
	}
	
	@RequestMapping(value="/logList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> logList(ModelMap map){
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Log> logList = publishQueryService.getLog(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", logList.size());
		resultMap.put("data", logList);
		return resultMap;
	}
	
	@RequestMapping(value="/promptList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> promptList(ModelMap map){
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<PromptOrder> promptList = publishQueryService.getPromptList(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", promptList.size());
		resultMap.put("data", promptList);
		return resultMap;
	}
	
	@RequestMapping(value="/paymentList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> paymentList(ModelMap map){
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Order> paymentList = publishQueryService.getPaymentList(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", paymentList.size());
		resultMap.put("data", paymentList);
		return resultMap;
	}
	
	
	@RequestMapping(value="/orderList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> orderList(ModelMap map){
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Order> orderList = publishQueryService.getOrderList(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", orderList.size());
		resultMap.put("data", orderList);
		return resultMap;
	}
	
	@RequestMapping(value="/expiredList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> expiredList(ModelMap map){
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Order> expiredList = publishQueryService.getExpiredList(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", expiredList.size());
		resultMap.put("data", expiredList);
		return resultMap;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
}
