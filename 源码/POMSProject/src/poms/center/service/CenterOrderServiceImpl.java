package poms.center.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import poms.center.constants.CommonConstants;
import poms.center.constants.ModifyTypeConstants;
import poms.center.dao.IOrderChangeDao;
import poms.center.dao.IOrderDao;
import poms.center.entity.NewspaperCount;
import poms.center.entity.Order;
import poms.center.entity.OrderChange;
import poms.center.entity.OrderCount;
import poms.center.entity.OrderPay;
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
	@Transactional
	public int deleteOrder(int stationID,int orderID) {
		// TODO Auto-generated method stub
		List<Order> orderList = orderDao.selectOrderByID(stationID, orderID);
		if(orderList.size() == 0){
			return 0;
		}
		
		Order order = orderList.get(0);
		OrderChange orderChange = new OrderChange();
		orderChange.setOrderID(order.getOrderID());
		orderChange.setOldValue(order.getOrderNum()+"");
		orderChange.setNewValue("0");
		orderChange.setChangeType(ModifyTypeConstants.UNSUBSCRIBE);
		order.setOrderNum(0);
		orderChangeDao.insertOrderChange(orderChange);
		return orderDao.updateOrder(order);
	}

	@Override
	@Transactional
	public int cancelDeleteOrder(int stationID,int orderID) {
		// TODO Auto-generated method stub
		Order order = orderDao.selectOrderByID(stationID, orderID).get(0);
		OrderChange orderChange = orderChangeDao.selectOrderChangeByID(order.getOrderID()).get(0);
		order.setOrderNum(Integer.parseInt(orderChange.getOldValue()));
		orderChangeDao.deleteOrderChange(orderID);
		return orderDao.updateOrder(order);
	}

	@Override
	@Transactional
	public int cancelChangeAddress(int stationID,int orderID) {
		// TODO Auto-generated method stub
		Order order = orderDao.selectOrderByID(stationID, orderID).get(0);
		OrderChange orderChange = orderChangeDao.selectOrderChangeByID(orderID).get(0);
		order.setOrderAddress(orderChange.getOldValue());
		orderChangeDao.deleteOrderChange(orderID);
		return orderDao.updateOrder(order);
	}

	@Override
	@Transactional
	public int cancelPostpone(int stationID,int orderID) throws ParseException {
		// TODO Auto-generated method stub
		Order order = orderDao.selectOrderByID(stationID, orderID).get(0);
		OrderChange orderChange = orderChangeDao.selectOrderChangeByID(orderID).get(0);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		order.setDeliverDate(simpleDateFormat.parse(orderChange.getOldValue()));
		orderChangeDao.deleteOrderChange(orderID);
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
	public List<Order> selectAllOrder(int stationID,int page) {
		// TODO Auto-generated method stub
		return orderDao.selectOrderList(stationID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<PromptOrder> selectPromptOrderList(int stationID,int page) {
		// TODO Auto-generated method stub
		return orderDao.selectPromptOrderList(stationID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<NewspaperCount> selectNewspaperCount() {
		// TODO Auto-generated method stub
		return orderDao.selectNewspaperCount();
	}

	@Override
	public Map<String, Object> selectSumByPeriod(Date startDate, Date endDate, int stationID) {
		// TODO Auto-generated method stub
		Map<String ,Object> result = new HashMap<String,Object>();
		result.put("stationID",stationID);
		result.put("cash",orderDao.getCashByPeriod(startDate,endDate,stationID));
		result.put("check",orderDao.getCheckSumByPeriod(startDate,endDate,stationID));
		result.put("coupon",orderDao.getCouponByPeriod(startDate,endDate,stationID));
		return result;
	}

	@Override
	public int updateOrderPay(OrderPay orderPay) {
		// TODO Auto-generated method stub
		return orderDao.updateOrderPay(orderPay);
	}

	@Override
	public List<OrderCount> selectOrderCountGroupByStationAndDate(Date date,int page) {
		// TODO Auto-generated method stub
		return orderDao.selectOrderCountGroupByStationAndDate(date,page*CommonConstants.PAGE_SIZE);
	}

	
}
