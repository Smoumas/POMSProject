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

import poms.center.entity.Department;
import poms.center.entity.Log;
import poms.center.entity.Order;
import poms.center.entity.Station;
import poms.supporter.service.IQueryService;

@Controller
@RequestMapping("/support/query")
@SessionAttributes({"stationID","departmentID","operator"})
public class QueryController {
	
	@Autowired
	private IQueryService queryService;
	
	@RequestMapping(value="/expiredOrder",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> selectExpiredOrder(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Order> orderList = queryService.selectExpiredOrder(stationID);
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("size", orderList.size());
		resultMap.put("data", orderList);
		return resultMap;
	}
	
	@RequestMapping(value="/operateLog",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> selectOperateLog(@RequestParam("beginDate") String beginDate,@RequestParam("endDate") String endDate,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Log> logList = queryService.selectOperateLog(stationID, beginDate, endDate);
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("size", logList.size());
		resultMap.put("data", logList);
		return resultMap;
	}
	
	@RequestMapping(value = "/stationList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> stationList(@RequestParam(value = "page", defaultValue = "0") int page) {
		List<Station> stationList = queryService.stationList(page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", stationList.size());
		resultMap.put("data", stationList);
		return resultMap;
	}
	
	@RequestMapping(value = "/departmentList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> departmentList(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "stationID", defaultValue = "-1") int stationID,ModelMap map) {
		if (stationID == -1) {
			stationID = (Integer) map.get("stationID");
		}
		List<Department> departmentList = queryService.selectDepartmentList(stationID, page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", departmentList.size());
		resultMap.put("data", departmentList);
		return resultMap;
	}
	
	
}
