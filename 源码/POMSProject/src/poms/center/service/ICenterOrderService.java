package poms.center.service;


import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.NewspaperCount;
import poms.center.entity.Order;
import poms.center.entity.OrderChange;
import poms.center.entity.OrderPay;
import poms.center.entity.PromptOrder;

public interface ICenterOrderService {
	
	public int insertOrder(Order order);
	public int updateOrder(Order order);
	public int deleteOrder(int stationID,int orderID);

	public int cancelDeleteOrder(int stationID,int orderID);
	public int cancelChangeAddress(int stationID,int orderID);
	public int cancelPostpone(int stationID,int orderID) throws ParseException;
	
	public List<Order> selectOrderByID(int stationID,int orderID);
	public List<Order> selectAllOrder(int stationID);
	
	public int insertOrderChange(OrderChange orderChange);
	
	public List<PromptOrder> selectPromptOrderList(@Param("stationID") int stationID);
	
	public List<NewspaperCount> selectNewspaperCount();
	
	public Map<String, Double> selectSumByPeriod(@Param("startDate")Date startDate, @Param("endDate")Date endDate, int stationID);

	public int updateOrderPay(OrderPay orderPay);
	
	
}
