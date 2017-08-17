package poms.center.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.Employee;
import poms.center.entity.Operator;
import poms.center.entity.Performance;
import poms.center.service.ICenterPersonManageService;

@Controller
@RequestMapping("/center/personManage")
@SessionAttributes({"stationID","departmentID","operator"})
public class CenterPersonManageController {

	@Autowired
	private ICenterPersonManageService centerPersonManageService;

	@RequestMapping(value="/insertEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertEmployee(Employee employee,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		int departmentID = (Integer)map.get("departmentID");
		employee.setStationID(stationID);
		employee.setDepartmentID(departmentID);
		int result = centerPersonManageService.insertEmployee(employee);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateEmployee(Employee employee){
		int result = centerPersonManageService.updateEmployee(employee);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteEmployee",method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteEmployee(@RequestParam("employeeID") int employeeID){
		int result = centerPersonManageService.deleteEmployee(employeeID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/employeeList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> employeeList(@RequestParam(value="page",defaultValue="0") int page,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Employee> employeeList = centerPersonManageService.selectEmployeeList(stationID,page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", employeeList.size());
		resultMap.put("data", employeeList);
		return resultMap;
	}
	
	
	@RequestMapping(value="/employeeByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> employeeByID(@RequestParam(value="page",defaultValue="0") int page,@RequestParam("employeeID") int employeeID,ModelMap map){
		List<Employee> employeeList = centerPersonManageService.selectEmployeeByID(employeeID,page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size",employeeList.size());
		resultMap.put("data",employeeList);
		return resultMap;
	}
	
	@RequestMapping(value="/employeeByName",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> employeeByName(@RequestParam(value="page",defaultValue="0") int page,@RequestParam("employeeName")String employeeName,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Employee> employeeList = centerPersonManageService.selectEmployeeByName(stationID, employeeName,page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", employeeList.size());
		resultMap.put("data", employeeList);
		return resultMap;
	}
	
	@RequestMapping(value="/deliverPerformance",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deliverPerformance(@RequestParam(value="page",defaultValue="0") int page,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Performance> deliverPerformanceList = centerPersonManageService.selectDeliverPerformance(stationID,page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", deliverPerformanceList.size());
		resultMap.put("data", deliverPerformanceList);
		return resultMap;
	}
	
	@RequestMapping(value="/salerPerformance",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> salerPerformance(@RequestParam(value="page",defaultValue="0") int page,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Performance> salerPerformanceList = centerPersonManageService.selectSalerPerformance(stationID,page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", salerPerformanceList.size());
		resultMap.put("data", salerPerformanceList);
		return resultMap;
	}
	
	@RequestMapping(value="/insertOperator",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertOperator(Operator operator){
		int result = centerPersonManageService.insertOperator(operator);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateOperator",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateOperator(@ModelAttribute("oper")Operator operator,ModelMap map){
		Operator sessionOperator = (Operator)map.get("operator");
		operator.setOperatorID(sessionOperator.getOperatorID());
		int result = centerPersonManageService.updateOperator(operator);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteOperator",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteOperator(@RequestParam("operatorID") int operatorID){
		int result = centerPersonManageService.deleteOperator(operatorID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/operatorList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> operatorList(@RequestParam(value="page",defaultValue="0") int page,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Operator> operatorList = centerPersonManageService.selectOperatorList(stationID,page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", operatorList.size());
		resultMap.put("data", operatorList);
		return resultMap;
	}
	
	@RequestMapping(value="/operatorByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> operatorByID(@RequestParam("operatorID") int operatorID){
		List<Operator> operatorList = centerPersonManageService.selectOperatorByID(operatorID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", operatorList.size());
		resultMap.put("data", operatorList);
		return resultMap;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> login(Operator operator,ModelMap map){
		int result = centerPersonManageService.login(operator);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);

		if(result>0){
			Operator loginOperator = centerPersonManageService.selectOperatorByID(operator.getOperatorID()).get(0);
			Employee employee = centerPersonManageService.selectEmployeeByID(loginOperator.getEmployeeID(),0).get(0);
			map.addAttribute("operator", loginOperator);
			map.addAttribute("stationID", employee.getStationID());
			map.addAttribute("departmentID", employee.getDepartmentID());
		}
		return resultMap;
	}
	
	@RequestMapping(value="/loginPage",method=RequestMethod.GET)
	public String loginPage(){
		return "login2";
	}
	
}
