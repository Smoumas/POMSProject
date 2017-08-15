package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Employee;
import poms.center.entity.Performance;

public interface IEmployeeDao {
	
	public int insertEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(@Param("employeeID") int employeeID);
	public List<Employee> selectEmployeeList(@Param("stationID") int stationID,@Param("begin") int begin);
	public List<Employee> selectEmployeeByID(@Param("employeeID")int employeeID,@Param("begin") int begin);
	public List<Employee> selectEmployeeByName(@Param("stationID") int stationID,@Param("employeeName") String name,@Param("begin") int begin);
	public List<Performance> selectDeliverPerformance(@Param("stationID") int stationID,@Param("begin") int begin);
	public List<Performance> selectSalerPerformance(@Param("stationID") int stationID,@Param("begin") int begin);
	
}
