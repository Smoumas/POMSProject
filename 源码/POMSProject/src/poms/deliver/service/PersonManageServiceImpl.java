package poms.deliver.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Duty;
import poms.center.entity.Employee;
import poms.center.entity.Operator;
import poms.center.service.ICenterDictionaryMaintainService;
import poms.center.service.ICenterPersonManageService;

@Service("personManageService")
public class PersonManageServiceImpl implements IPersonManageService {

	@Autowired
	private ICenterPersonManageService centerPersonManageService;
	
	@Autowired
	private ICenterDictionaryMaintainService centerDictionaryMaintainService;
	
	
	@Override
	public int insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return centerPersonManageService.insertEmployee(employee);
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return centerPersonManageService.updateEmployee(employee);
	}

	@Override
	public List<Employee> selectEmployeeByID(int employeeID,int page) {
		// TODO Auto-generated method stub
		return centerPersonManageService.selectEmployeeByID(employeeID,page);
	}

	@Override
	public List<Employee> queryAllEmployee(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerPersonManageService.selectEmployeeList(stationID,page);
	}

	@Override
	public int deleteEmployeeByID(int employeeID) {
		// TODO Auto-generated method stub
		return centerPersonManageService.deleteEmployee(employeeID);
	}

	@Override
	public int insertOperator(Operator operator) {
		// TODO Auto-generated method stub
		return centerPersonManageService.insertOperator(operator);
	}

	@Override
	public int updateOperator(Operator operator) {
		// TODO Auto-generated method stub
		return centerPersonManageService.updateOperator(operator);
	}

	@Override
	public List<Operator> selectOperatorByID(int operatorID) {
		// TODO Auto-generated method stub
		return centerPersonManageService.selectOperatorByID(operatorID);
	}

	@Override
	public List<Operator> queryAllOperator(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerPersonManageService.selectOperatorList(stationID,page);
	}

	@Override
	public int deleteOperatorByID(int operatorID) {
		// TODO Auto-generated method stub
		return centerPersonManageService.deleteOperator(operatorID);
	}

	@Override
	public List<Employee> selectEmployeeByName(int stationID, String employeeName, int page) {
		// TODO Auto-generated method stub
		return centerPersonManageService.selectEmployeeByName(stationID, employeeName, page);
	}

	@Override
	public List<Duty> selectDutyList(int departmentID, int page) {
		// TODO Auto-generated method stub
		return centerDictionaryMaintainService.selectDutyList(departmentID, page);
	}

}
