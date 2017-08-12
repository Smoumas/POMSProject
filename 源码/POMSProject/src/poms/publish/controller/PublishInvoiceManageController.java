package poms.publish.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import poms.publish.service.IPublishInvoiceManageService;

@Controller
@RequestMapping("/publish/invoice")
public class PublishInvoiceManageController {

	@Autowired
	private IPublishInvoiceManageService publishInvoiceManageService;
	
	@RequestMapping(value="/invoiceManage",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> invoiceManage(@RequestParam("invoiceID") int invoiceID,@RequestParam("state") int state,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		int result = publishInvoiceManageService.invoiceManage(stationID,invoiceID, state);
		Map<String,Object> resultMap  = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
}
