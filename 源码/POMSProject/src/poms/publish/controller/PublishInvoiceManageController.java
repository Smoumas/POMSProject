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
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.publish.service.IPublishInvoiceManageService;

@Controller
@RequestMapping("/publish/invoice")
@SessionAttributes({"stationID","departmentID","operator"})
public class PublishInvoiceManageController {

	@Autowired
	private IPublishInvoiceManageService publishInvoiceManageService;
	
	@RequestMapping(value="/invoiceManage",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> invoiceManage(@RequestParam("page") int page,@RequestParam("invoiceID") int invoiceID,@RequestParam("state") int state,ModelMap map){
		int result = publishInvoiceManageService.invoiceManage(invoiceID, state,page);
		Map<String,Object> resultMap  = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
}
