package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Employee;
import poms.center.entity.Performance;

public interface IEmployeeDao {
	
	public int insertEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(@Param("employeeID") int employeeID);
	public List<Employee> selectEmployeeList(@Param("stationID") int stationID);
	public List<Employee> selectEmployeeByID(@Param("employeeID")int employeeID);
	public List<Employee> selectEmployeeByName(@Param("stationID") int stationID,@Param("name") String name);
	public List<Performance> selectDeliverPerformance(@Param("stationID") int stationID);
	public List<Performance> selectSalerPerformance(@Param("stationID") int stationID);
	
}
