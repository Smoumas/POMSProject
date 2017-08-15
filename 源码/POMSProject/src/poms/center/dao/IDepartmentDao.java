package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Department;

public interface IDepartmentDao {

	public int insertDepartment(Department department);

	public int updateDepartment(Department department);

	public int deleteDepartment(@Param("departmentID") int departmentID);

	public List<Department> selectDepartmentList(@Param("stationID") int stationID, @Param("begin") int begin);

	public List<Department> selectDepartmentByID(@Param("stationID") int stationID,
			@Param("departmentID") int departmentID, @Param("begin") int begin);

	public List<Department> selectDepartmentListByName(@Param("stationID") int stationID,
			@Param("departmentName") String departmentName,@Param("begin") int begin);
}
