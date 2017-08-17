package poms.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.dao.IStationDao;
import poms.center.entity.Employee;
import poms.center.entity.Operator;
import poms.center.service.ICenterPersonManageService;

import java.util.List;

/**
 * Created by sakamichi on 2017/8/8.
 */
@Service("staffService")
public class StaffService implements IStaffService {

	@Autowired
	private ICenterPersonManageService centerPersonManageService;

    @Override
    public List<Employee> getAllEmployee(int stationID,int page){
    	return centerPersonManageService.selectEmployeeList(stationID,page);
    }

    @Override
    public int updateEmployee(Employee employee){
    	return centerPersonManageService.updateEmployee(employee);
    }

    @Override
    public int newEmployee(Employee employee){
    	return centerPersonManageService.insertEmployee(employee);
    }

    @Override
    public int deleteEmployee(int employeeID){
    	return centerPersonManageService.deleteEmployee(employeeID);
    }

    @Override
    public List<Employee> employeeList(int stationID,int page){
    	return centerPersonManageService.selectEmployeeList(stationID,page);
    }

    @Override
    public List<Operator> getAllOperator(int stationID,int page){
    	return centerPersonManageService.selectOperatorList(stationID,page);
    }

    @Override
    public int updateLevel(int operatorID,int level){
    	Operator operator = centerPersonManageService.selectOperatorByID(operatorID).get(0);
    	operator.setLevel(level);
    	return centerPersonManageService.updateOperator(operator);
    }

    @Override
    public int setEmployeeDuty(int employeeID, int dutyType,int page){
    	Employee employee = centerPersonManageService.selectEmployeeByID(employeeID,page).get(0);
    	employee.setDutyID(dutyType);
    	return centerPersonManageService.updateEmployee(employee);
    }
}
