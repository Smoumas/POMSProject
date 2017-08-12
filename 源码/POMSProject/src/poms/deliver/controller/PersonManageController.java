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

import poms.center.entity.Employee;
import poms.center.entity.Operator;
import poms.deliver.service.IPersonManageService;

@Controller
@RequestMapping("/deliver/personManage")
public class PersonManageController {

	@Resource
	private IPersonManageService personManageService;

	@RequestMapping(value="/addEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> addEmployee(Employee employee,ModelMap modelMap){
		int stationID = (int)modelMap.get("stationID");
		employee.setStationID(stationID);
		int state = this.personManageService.insertEmployee(employee);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("state", state);
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
		map.put("state", state);
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
		map.put("state", state);
		if(state!=1){
			map.put("error", "员工信息更新失败,请重试");
		}
		return map;
	}
	
	@RequestMapping(value="/queryAllEmployee",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> employeeList(ModelMap modelMap){
		int stationID = (int) modelMap.get("stationID");
		List<Employee> employeeList = this.personManageService.queryAllEmployee(stationID);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("size", employeeList.size());
		map.put("data", employeeList);
		return map;
	}
	
	@RequestMapping("/addOperator")
	@ResponseBody
	public Map<String,Object> addOperator(Operator operator){
		int state = this.personManageService.insertOperator(operator);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("state", state);
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
		map.put("state", state);
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
		map.put("state", state);
		if(state!=1){
			map.put("error", "操作员信息更新失败,请重试");
		}
		return map;
	}
	
	@RequestMapping("/queryAllOperator")
	@ResponseBody
	public Map<String,Object> OperatorList(ModelMap modelMap){
		int stationID = (int) modelMap.get("stationID");
		List<Operator> employeeList = this.personManageService.queryAllOperator(stationID);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("size", employeeList.size());
		map.put("data", employeeList);
		return map;
	}
}
