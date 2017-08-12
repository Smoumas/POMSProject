package poms.publish.service;

import java.util.List;

import poms.center.entity.Employee;
import poms.center.entity.Performance;

public interface IPublishEmployeeManageService {
	
	
	public int newEmployee(Employee employee);
	public int deleteEmployee(int employeeID);
	public int updateEmployee(Employee employee);
	public List<Employee> selectEmployeeList(int stationID);
	
	public int setEmployeeDuty(int employeeID,int dutyType);
	public int setOperatorLevel(int operatorID,int level);
	
	public List<Performance> selectSalerPerformance(int stationID);
	public List<Performance> selectDeliverPerformance(int stationID);
}
