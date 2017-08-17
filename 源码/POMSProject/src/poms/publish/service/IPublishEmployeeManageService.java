package poms.publish.service;

import java.util.List;

import poms.center.entity.Duty;
import poms.center.entity.Employee;
import poms.center.entity.Operator;
import poms.center.entity.Performance;

public interface IPublishEmployeeManageService {
	
	
	public int newEmployee(Employee employee);
	public int deleteEmployee(int employeeID);
	public int updateEmployee(Employee employee);
	public List<Employee> selectEmployeeList(int stationID,int page);
	
	public int setEmployeeDuty(int employeeID,int dutyType,int page);
	public int setOperatorLevel(Operator operator,int level);
	
	public List<Performance> selectSalerPerformance(int stationID,int page);
	public List<Performance> selectDeliverPerformance(int stationID,int page);
	public List<Duty> selectDutyList(int departmentID, int page);
}
