package poms.center.service;

import java.util.Date;
import java.util.List;


import poms.center.entity.Order;

public interface ICenterQueryService {

	public List<Order> selectCustomerPeriodOrder(int stationID,int customerID,Date beginDate,Date endDate);
	public List<Order> selectOrderListByNewspaperName(int stationID,String newspaperName);
	public List<Order> selectOrderListByCustomerName(int stationID,String customerName);
	public List<Order> selectOrderByID(int stationID,int orderID);
	
	public int orderCount(int stationID,Date orderDate);
	
}
