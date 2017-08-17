package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.DepartmentDuty;

public interface IDepartmentDutyDao {
	public List<DepartmentDuty> departmentDutyList(@Param("begin") int begin);
	public List<DepartmentDuty> departmentDutyListByName(@Param("departmentName") String departmentName,@Param("begin") int begin);
}
