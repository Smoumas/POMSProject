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
		Map<String, Object> modelMap = new HashMap<String, Object>();
		int result = invoiceService.register(invoice);
		modelMap.put("result", result);
		return modelMap;
	}

	@RequestMapping(value = "/grantInvoice", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> grantInvoiceToStation(@RequestParam("grantStationID") int grantStationID,
			@RequestParam("invoiceID") int invoiceID, ModelMap map) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		int stationID = (Integer) map.get("stationID");
		int result = invoiceService.grant(stationID, grantStationID, invoiceID);
		modelMap.put("result", result);
		return modelMap;
	}

	@RequestMapping(value = "/returnInvoice", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> returnInvoice(ModelMap map) {
		int stationID = (Integer)map.get("stationID");
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<Invoice> invoiceList = invoiceService.returnService(stationID);
		modelMap.put("size", invoiceList.size());
		modelMap.put("data", invoiceList);
		return modelMap;
	}

}
