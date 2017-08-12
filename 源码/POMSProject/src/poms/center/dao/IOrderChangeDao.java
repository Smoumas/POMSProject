package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.OrderChange;

public interface IOrderChangeDao {
	
	public int insertOrderChange(OrderChange orderChange);
	public int updateOrderChange(OrderChange orderChange);
	public int deleteOrderChange(@Param("orderID") int orderID);
	
	public List<OrderChange> selectOrderChangeByID(@Param("orderID") int orderID);
}
