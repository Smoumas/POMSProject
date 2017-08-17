package poms.deliver.service;

import java.util.List;

import poms.center.entity.Duty;
import poms.center.entity.Employee;
import poms.center.entity.Operator;

public interface IPersonManageService {
	public int insertEmployee(Employee employee);

	public int updateEmployee(Employee employee);

	public List<Employee> selectEmployeeByID(int employeeID,int page);

	public List<Employee> queryAllEmployee(int stationID,int page);

	public int deleteEmployeeByID(int employeeID);

	public int insertOperator(Operator operator);

	public int updateOperator(Operator operator);

	public List<Operator> selectOperatorByID(int operatorID);

	public List<Operator> queryAllOperator(int stationID,int page);

	public int deleteOperatorByID(int operatorID);

	public List<Employee> selectEmployeeByName(int stationID, String employeeName, int page);
	
	public List<Duty> selectDutyList(int departmentID,int page);
}
