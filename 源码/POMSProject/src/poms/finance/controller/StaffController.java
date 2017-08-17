package poms.finance.controller;

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
import poms.finance.service.StaffService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sakamichi on 2017/8/8.
 */
@Controller
@RequestMapping("/finance/staff")
@SessionAttributes({"stationID","departmentID","operator"})
public class StaffController {

	@Autowired
	private StaffService staffService;

	@RequestMapping(value = "/newEmployee", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> newEmployee(Employee employee,ModelMap map) {
		int stationID = (Integer)map.get("stationID");
		int departmentID = (Integer)map.get("departmentID");
		employee.setStationID(stationID);
		employee.setDepartmentID(departmentID);
		int result = staffService.newEmployee(employee);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> deleteEmployee(@RequestParam("employeeID") int employeeID) {
		int result = staffService.deleteEmployee(employeeID);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateEmployee(Employee employee) {
		int result = staffService.updateEmployee(employee);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping(value = "/employeeList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> employeeList(@RequestParam(value="page",defaultValue="0") int page, ModelMap map) {
		int stationID = (Integer) map.get("stationID");
		List<Employee> employeeList = staffService.employeeList(stationID, page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", employeeList.size());
		resultMap.put("data", employeeList);
		return resultMap;
	}

	@RequestMapping(value = "/setEmployeeDuty", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> setEmployeeDuty(@RequestParam("employeeID") int employeeID,
			@RequestParam("dutyType") int dutyType, @RequestParam(value="page",defaultValue="0") int page, ModelMap map) {
		int result = staffService.setEmployeeDuty(employeeID, dutyType,page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

	@RequestMapping("/queryAllOperator")
	@ResponseBody
	public Map<String, Object> OperatorList(@RequestParam(value="page",defaultValue="0") int page,ModelMap modelMap) {
		int stationID = (int) modelMap.get("stationID");
		List<Operator> employeeList = this.staffService.getAllOperator(stationID,page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", employeeList.size());
		map.put("data", employeeList);
		return map;
	}

	@RequestMapping("/updateLevel")
	@ResponseBody
	public Map<String, Object> updateLevel(@RequestParam("operatorID") int operatorID,
			@RequestParam("level") int level) {
		int result = this.staffService.updateLevel(operatorID, level);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", result);
		return map;
	}
}
