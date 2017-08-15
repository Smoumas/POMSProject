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
	
    public List<Employee> getAllEmployee(int stationID,int page){
    	return centerPersonManageService.selectEmployeeList(stationID,page);
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
    
    public List<Employee> employeeList(int stationID,int page){
    	return centerPersonManageService.selectEmployeeList(stationID,page);
    }

    public List<Operator> getAllOperator(int stationID,int page){
    	return centerPersonManageService.selectOperatorList(stationID,page);
    }

    public int updateLevel(int operatorID,int level){
    	Operator operator = centerPersonManageService.selectOperatorByID(operatorID).get(0);
    	operator.setLevel(level);
    	return centerPersonManageService.updateOperator(operator);
    }
    
    public int setEmployeeDuty(int employeeID, int dutyType,int page){
    	Employee employee = centerPersonManageService.selectEmployeeByID(employeeID,page).get(0);
    	employee.setDutyID(dutyType);
    	return centerPersonManageService.updateEmployee(employee);
    }
}
