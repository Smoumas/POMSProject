package poms.deliver.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.PrinterEverydaySummary;
import poms.deliver.service.ISummaryService;

@Controller
@RequestMapping("/deliver/summary")
@SessionAttributes({"stationID","departmentID","operator"})
public class SummaryController {
	@Resource
	private ISummaryService summaryService;

	@RequestMapping("/summaryPrintNumber")
	@ResponseBody
	public Map<String, Object> summaryPrintNumber(@RequestParam("date") Date date,@RequestParam(value="page",defaultValue="0") int page, ModelMap modelMap) {
		int stationID = (int) modelMap.get("stationID");
		List<PrinterEverydaySummary> list = this.summaryService.summaryPrintNumber(date, stationID,page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", list.size());
		map.put("data", list);
		return map;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
}
