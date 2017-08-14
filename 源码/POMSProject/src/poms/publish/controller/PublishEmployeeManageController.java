package poms.publish.controller;

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

import poms.center.entity.Employee;
import poms.center.entity.Operator;
import poms.center.entity.Performance;
import poms.publish.service.IPublishEmployeeManageService;

@Controller
@RequestMapping("/publish/employeeManage")
@SessionAttributes({"stationID","departmentID","operator"})
public class PublishEmployeeManageController {

	@Autowired
	private IPublishEmployeeManageService publishEmployeeManageService;

	@RequestMapping(value="/newEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> newEmployee(Employee employee){
		int result = publishEmployeeManageService.newEmployee(employee);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteEmployee",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteEmployee(@RequestParam("employeeID") int employeeID){
		int result = publishEmployeeManageService.deleteEmployee(employeeID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateEmployee(Employee employee){
		int result = publishEmployeeManageService.updateEmployee(employee);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/employeeList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> employeeList(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Employee> employeeList = publishEmployeeManageService.selectEmployeeList(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", employeeList.size());
		resultMap.put("data", employeeList);
		return resultMap;
	}
	
	@RequestMapping(value="/setEmployeeDuty",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> setEmployeeDuty(@RequestParam("employeeID") int employeeID,@RequestParam("dutyType") int dutyType,ModelMap map){
		int result = publishEmployeeManageService.setEmployeeDuty(employeeID, dutyType);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/setOperatorLevel",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> setOperatorLevel(@RequestParam("level") int level,ModelMap map){
		Operator operator = (Operator)map.get("operator");
		int result = publishEmployeeManageService.setOperatorLevel(operator, level);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/salerPerformanceList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> salerPerformanceList(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Performance> salerPerformanceList = publishEmployeeManageService.selectSalerPerformance(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", salerPerformanceList.size());
		resultMap.put("data", salerPerformanceList);
		return resultMap;
	}
	
	@RequestMapping(value="/deliverPerformanceList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deliverPerformanceList(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Performance> deliverPerformanceList = publishEmployeeManageService.selectDeliverPerformance(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", deliverPerformanceList.size());
		resultMap.put("data", deliverPerformanceList);
		return resultMap;
	}
	
}
