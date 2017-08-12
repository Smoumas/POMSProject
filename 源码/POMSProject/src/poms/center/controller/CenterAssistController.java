package poms.center.controller;

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

import poms.center.entity.Advice;
import poms.center.service.ICenterAssistService;

@Controller
@RequestMapping("/center/assist")
public class CenterAssistController {

	@Autowired
	private ICenterAssistService centerAssistService;


	@RequestMapping(value = "/insertAdvice", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> insertAdvice(Advice advice) {
		int result = centerAssistService.insertAdvice(advice);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/adviceList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> adviceList(@RequestParam("isReaded") int isReaded, ModelMap map) {
		// int stationID = (Integer)map.get("stationID");
		int stationID = 1;
		int departmentID = (Integer)map.get("departmentID");
		List<Advice> adviceList = centerAssistService.selectAdviceList(stationID, departmentID, isReaded);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", adviceList.size());
		resultMap.put("data", adviceList);
		return resultMap;
	}

	@RequestMapping(value = "/correctOrderAddress", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> correctOrderAddress(@RequestParam("orderID") int orderID,
			@RequestParam("newAddress") String newAddress, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		int result = centerAssistService.correctOrderAddress(stationID, orderID, newAddress);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
}
