package poms.deliver.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.Duty;
import poms.center.entity.Employee;
import poms.center.entity.Operator;
import poms.deliver.service.IPersonManageService;

@Controller
@RequestMapping("/deliver/personManage")
@SessionAttributes({"stationID","departmentID","operator"})
public class PersonManageController {

	@Resource
	private IPersonManageService personManageService;

	@RequestMapping(value="/addEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> addEmployee(Employee employee,ModelMap modelMap){
		int stationID = (int)modelMap.get("stationID");
		int departmentID = (int) modelMap.get("departmentID");
		employee.setStationID(stationID);
		employee.setDepartmentID(departmentID);
		System.out.println(employee.getDutyID());
		int state = this.personManageService.insertEmployee(employee);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if(state!=1){
			map.put("error","员工信息添加失败,请重试");
		}
		return map;
	}
	
	@RequestMapping(value="/deleteEmployee",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteEmployee(@RequestParam("employeeID") int employeeID){
		int state = this.personManageService.deleteEmployeeByID(employeeID);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if(state!=1){
			map.put("error","员工信息删除失败,请重试");
		}
		return map;
	}
	
	@RequestMapping(value="/updateEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateEmployee(Employee employee){
		int state = this.personManageService.updateEmployee(employee);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if(state!=1){
			map.put("error", "员工信息更新失败,请重试");
		}
		return map;
	}
	
	@RequestMapping(value="/queryAllEmployee",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> employeeList(@RequestParam(value="page",defaultValue="0") int page,ModelMap modelMap){
		int stationID = (int) modelMap.get("stationID");
		List<Employee> employeeList = this.personManageService.queryAllEmployee(stationID,page);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("size", employeeList.size());
		map.put("data", employeeList);
		return map;
	}
	
	@RequestMapping(value="/employeeByName",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> employeeByName(@RequestParam(value="page",defaultValue="0") int page,@RequestParam("employeeName")String employeeName,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Employee> employeeList = this.personManageService.selectEmployeeByName(stationID, employeeName,page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", employeeList.size());
		resultMap.put("data", employeeList);
		return resultMap;
	}
	
	@RequestMapping("/addOperator")
	@ResponseBody
	public Map<String,Object> addOperator(Operator operator){
		int state = this.personManageService.insertOperator(operator);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if(state!=1){
			map.put("error","操作员信息添加失败,请重试");
		}
		return map;
	}
	
	@RequestMapping("/deleteOperator")
	@ResponseBody
	public Map<String,Object> deleteOperator(@RequestParam("operatorID") int operatorID){
		int state = this.personManageService.deleteOperatorByID(operatorID);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if(state!=1){
			map.put("error","操作员信息删除失败,请重试");
		}
		return map;
	}
	
	@RequestMapping("/updateOperator")
	@ResponseBody
	public Map<String,Object> updateOperator(Operator operator){
		int state = this.personManageService.updateOperator(operator);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if(state!=1){
			map.put("error", "操作员信息更新失败,请重试");
		}
		return map;
	}
	
	@RequestMapping("/queryAllOperator")
	@ResponseBody
	public Map<String,Object> OperatorList(@RequestParam(value="page",defaultValue="0") int page,ModelMap modelMap){
		int stationID = (int) modelMap.get("stationID");
		List<Operator> employeeList = this.personManageService.queryAllOperator(stationID,page);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("size", employeeList.size());
		map.put("data", employeeList);
		return map;
	}
	
	@RequestMapping(value = "/dutyList", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> dutyList(@RequestParam(value = "page", defaultValue = "0") int page, ModelMap map) {
		int departmentID = (Integer) map.get("departmentID");
		List<Duty> dutyList = this.personManageService.selectDutyList(departmentID, page);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", dutyList.size());
		resultMap.put("data", dutyList);
		return resultMap;
	}
}
