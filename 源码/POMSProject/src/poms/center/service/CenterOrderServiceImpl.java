package poms.center.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.ModifyTypeConstants;
import poms.center.dao.IOrderChangeDao;
import poms.center.dao.IOrderDao;
import poms.center.entity.NewspaperCount;
import poms.center.entity.Order;
import poms.center.entity.OrderChange;
import poms.center.entity.PromptOrder;

@Service("centerOrderService")
public class CenterOrderServiceImpl implements ICenterOrderService{

	@Autowired
	private IOrderDao orderDao;
	
	@Autowired
	private IOrderChangeDao orderChangeDao;
	
	
	
	
	@Override
	public int insertOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.insertOrder(order);
	}

	@Override
	public int updateOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.updateOrder(order);
	}

	@Override
	public int deleteOrder(int stationID,int orderID) {
		// TODO Auto-generated method stub
		Order order = orderDao.selectOrderByID(stationID, orderID).get(0);
		OrderChange orderChange = new OrderChange();
		orderChange.setOrderID(order.getOrderID());
		orderChange.setOldValue(order.getOrderNum()+"");
		orderChange.setNewValue("0");
		orderChange.setOrderType(ModifyTypeConstants.UNSUBSCRIBE);
		order.setOrderNum(0);
		orderChangeDao.insertOrderChange(orderChange);
		return orderDao.updateOrder(order);
	}

	@Override
	public int cancelDeleteOrder(int stationID,int orderID) {
		// TODO Auto-generated method stub
		Order order = orderDao.selectOrderByID(stationID, orderID).get(0);
		OrderChange orderChange = orderChangeDao.selectOrderChangeByID(order.getOrderID()).get(0);
		order.setOrderNum(Integer.parseInt(orderChange.getOldValue()));
		return orderDao.updateOrder(order);
	}

	@Override
	public int cancelChangeAddress(int stationID,int orderID) {
		// TODO Auto-generated method stub
		Order order = orderDao.selectOrderByID(stationID, orderID).get(0);
		OrderChange orderChange = orderChangeDao.selectOrderChangeByID(orderID).get(0);
		order.setOrderAddress(orderChange.getOldValue());
		return orderDao.updateOrder(order);
	}

	@Override
	public int cancelPostpone(int stationID,int orderID) throws ParseException {
		// TODO Auto-generated method stub
		Order order = orderDao.selectOrderByID(stationID, orderID).get(0);
		OrderChange orderChange = orderChangeDao.selectOrderChangeByID(orderID).get(0);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		order.setDeliverDate(simpleDateFormat.parse(orderChange.getOldValue()));
		return orderDao.updateOrder(order);
	}

	@Override
	public List<Order> selectOrderByID(int stationID,int orderID) {
		// TODO Auto-generated method stub
		return orderDao.selectOrderByID(stationID, orderID);
	}

	
	
	@Override
	public int insertOrderChange(OrderChange orderChange) {
		// TODO Auto-generated method stub
		return orderChangeDao.insertOrderChange(orderChange);
	}

	@Override
	public List<Order> selectAllOrder(int stationID) {
		// TODO Auto-generated method stub
		return orderDao.selectOrderList(stationID);
	}

	@Override
	public List<PromptOrder> selectPromptOrderList(int stationID) {
		// TODO Auto-generated method stub
		return orderDao.selectPromptOrderList(stationID);
	}

	@Override
	public List<NewspaperCount> selectNewspaperCount() {
		// TODO Auto-generated method stub
		return orderDao.selectNewspaperCount();
	}

	
}
