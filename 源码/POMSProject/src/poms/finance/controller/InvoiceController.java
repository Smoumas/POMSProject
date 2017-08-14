package poms.finance.controller;

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
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.Invoice;
import poms.finance.service.InvoiceService;

/**
 * Created by sakamichi on 2017/8/8.
 */
@Controller
@RequestMapping("/invoice")
@SessionAttributes("stationID")
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;

	@RequestMapping(value = "/registerInvoice", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> registerInvoice(Invoice invoice, ModelMap map) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		int result = invoiceService.register(invoice);
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/grantInvoice", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> grantInvoiceToStation(Invoice invoice, ModelMap map) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		int result = invoiceService.grant(invoice);
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/returnInvoice", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> returnInvoice(Invoice invoice, ModelMap map) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		int result = invoiceService.returnService(invoice);
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/queryInvoice", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryInvoice(ModelMap map) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Invoice> invoiceList = invoiceService.query();
		resultMap.put("size", invoiceList.size());
		resultMap.put("data", invoiceList);
		return resultMap;
	}

}
