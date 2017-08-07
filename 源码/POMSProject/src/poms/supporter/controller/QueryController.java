package poms.supporter.controller;

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

import poms.center.entity.Log;
import poms.center.entity.Order;
import poms.supporter.service.IQueryService;

@Controller
@RequestMapping("/support/query")
@SessionAttributes("stationID")
public class QueryController {
	
	@Autowired
	private IQueryService queryService;
	
	@RequestMapping(value="/expiredOreder",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> selectExpiredOrder(ModelMap map){
//		int stationID = Integer.parseInt(map.get("stationID").toString());
		int stationID = 1;
		List<Order> orderList = queryService.selectExpiredOrder(stationID);
		Map<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("size", orderList.size());
		modelMap.put("data", orderList);
		return modelMap;
	}
	
	@RequestMapping(value="/operateLog",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> selectOperateLog(@RequestParam("beginDate") String beginDate,@RequestParam("endDate") String endDate,ModelMap map){
		int stationID = Integer.parseInt(map.get("stationID").toString());
		List<Log> logList = queryService.selectOperateLog(stationID, beginDate, endDate);
		Map<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("size", logList.size());
		modelMap.put("data", logList);
		return modelMap;
	}
}
