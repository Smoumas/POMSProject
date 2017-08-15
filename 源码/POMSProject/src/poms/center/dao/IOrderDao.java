package poms.center.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.NewspaperCount;
import poms.center.entity.Order;
import poms.center.entity.OrderCount;
import poms.center.entity.OrderPay;
import poms.center.entity.PromptOrder;

public interface IOrderDao {

	public int insertOrder(Order order);
	public int updateOrder(Order order);

	public List<Order> selectOrderList(@Param("stationID")int stationID,@Param("begin") int begin);
	public List<Order> selectOrderByID(@Param("stationID")int stationID,@Param("orderID")int orderID);
	public List<OrderCount> selectOrderCountGroupByStation(@Param("begin") int begin);
	public List<Order> selectCustomerPeriodOrder(@Param("stationID")int stationID,
			@Param("customerID")int customerID,@Param("beginDate")Date beginDate,@Param("endDate")Date endDate,@Param("begin") int begin);
	public List<Order> selectOrderListByNewspaperName(@Param("stationID") int stationID,
			@Param("newspaperName")String newspaperName,@Param("begin") int begin);
	public List<Order> selectOrderListByCustomerName(@Param("stationID")int stationID,
			@Param("customerName")String customerName,@Param("begin") int begin);
	
	
	public int orderCount(@Param("stationID") int stationID,@Param("orderDate") Date orderDate);

	public List<PromptOrder> selectPromptOrderList(@Param("stationID") int stationID);
	
	public List<NewspaperCount> selectNewspaperCount();
	
	public double getCheckSumByPeriod(@Param("startDate")Date startDate,@Param("endDate")Date endDate,@Param("stationID")int stationID);
	public double getCouponByPeriod(@Param("startDate")Date startDate,@Param("endDate")Date endDate,@Param("stationID")int stationID);
	public double getCashByPeriod(@Param("startDate")Date startDate, @Param("endDate")Date endDate,@Param("stationID")int stationID);

	public int updateOrderPay(@Param("orderPay")OrderPay orderPay);
	
	
	public List<OrderCount> selectOrderCountGroupByStationAndDate(@Param("date")Date date);

}
