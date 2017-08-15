package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Operator;

public interface IOperatorDao {
	
	public int insertOperator(Operator operator);
	public int updateOperator(Operator operator);
	public int deleteOperator(@Param("operatorID") int operatorID);
	public List<Operator> selectOperatorList(@Param("stationID")int stationID,@Param("begin") int begin);
	public List<Operator> selectOperatorByID(@Param("operatorID")int operatorID);
}
