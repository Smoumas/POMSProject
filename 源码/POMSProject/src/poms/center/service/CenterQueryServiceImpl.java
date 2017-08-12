package poms.center.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.dao.IOrderDao;
import poms.center.entity.Order;

@Service("centerQueryService")
public class CenterQueryServiceImpl implements ICenterQueryService{

	@Autowired
	private IOrderDao orderDao;
	
	@Override
	public List<Order> selectCustomerPeriodOrder(int stationID,int customerID, Date beginDate, Date endDate) {
		// TODO Auto-generated method stub
		return orderDao.selectCustomerPeriodOrder(stationID,customerID, beginDate, endDate);
	}

	@Override
	public List<Order> selectOrderListByNewspaperName(int stationID,String newspaperName) {
		// TODO Auto-generated method stub
		return orderDao.selectOrderListByNewspaperName(stationID,newspaperName);
	}

	@Override
	public List<Order> selectOrderListByCustomerName(int staionID,String customerName) {
		// TODO Auto-generated method stub
		return orderDao.selectOrderListByCustomerName(staionID,customerName);
	}

	@Override
	public List<Order> selectOrderByID(int stationID, int orderID) {
		// TODO Auto-generated method stub
		return orderDao.selectOrderByID(stationID, orderID);
	}

	@Override
	public int orderCount(int stationID, Date orderDate) {
		// TODO Auto-generated method stub
		return orderDao.orderCount(stationID,orderDate);
	}
	
	

}
