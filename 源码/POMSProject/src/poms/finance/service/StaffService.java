package poms.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Employee;
import poms.center.entity.Operator;
import poms.center.service.ICenterPersonManageService;

import java.util.List;

/**
 * Created by sakamichi on 2017/8/8.
 */
@Service("staffService")
public class StaffService {

	@Autowired
	private ICenterPersonManageService centerPersonManageService;
	
    public List<Employee> getAllEmployee(int stationID){
    	return centerPersonManageService.selectEmployeeList(stationID);
    }

    public int updateEmployee(Employee employee){
    	return centerPersonManageService.updateEmployee(employee);
    }
    
    public int newEmployee(Employee employee){
    	return centerPersonManageService.insertEmployee(employee);
    }
    
    public int deleteEmployee(int employeeID){
    	return centerPersonManageService.deleteEmployee(employeeID);
    }
    
    public List<Employee> employeeList(int stationID){
    	return centerPersonManageService.selectEmployeeList(stationID);
    }

    public List<Operator> getAllOperator(int stationID){
    	return centerPersonManageService.selectOperatorList(stationID);
    }

    public int updateLevel(int operatorID,int level){
    	Operator operator = centerPersonManageService.selectOperatorByID(operatorID).get(0);
    	operator.setLevel(level);
    	return centerPersonManageService.updateOperator(operator);
    }
    
    public int setEmployeeDuty(int employeeID, int dutyType){
    	Employee employee = centerPersonManageService.selectEmployeeByID(employeeID).get(0);
    	employee.setDutyID(dutyType);
    	return centerPersonManageService.updateEmployee(employee);
    }
}
