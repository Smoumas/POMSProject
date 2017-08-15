package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Duty;

public interface IDutyDao {
	
	public int insertDuty(Duty duty);

	public int updateDuty(Duty duty);

	public int deleteDuty(@Param("dutyType") int dutyType);

	public List<Duty> selectDutyList(@Param("departmentID")int departmentID,@Param("begin") int begin);

	public List<Duty> selectDutyByType(@Param("dutyType") int dutyType,@Param("begin") int begin);
	
	public List<Duty> selectDutyListByName(@Param("dutyName") String dutyName,@Param("begin") int begin);

}
