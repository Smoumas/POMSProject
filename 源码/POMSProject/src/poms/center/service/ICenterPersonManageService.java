package poms.center.service;

import java.util.List;

import poms.center.entity.Employee;
import poms.center.entity.Operator;
import poms.center.entity.Performance;

public interface ICenterPersonManageService {
	
	public int insertEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(int employeeID);
	public List<Employee> selectEmployeeList(int stationID,int page);
	public List<Employee> selectEmployeeByID(int employeeID,int page);
	public List<Employee> selectEmployeeByName(int stationID,String name,int page);
	public List<Performance> selectDeliverPerformance(int stationID,int page);
	public List<Performance> selectSalerPerformance(int stationID,int page);
	
	public int insertOperator(Operator operator);
	public int updateOperator(Operator operator);
	public int deleteOperator(int operatorID);
	public List<Operator> selectOperatorList(int stationID,int page);
	public List<Operator> selectOperatorByID(int operatorID);
	
	public int login(Operator operator);
}	
