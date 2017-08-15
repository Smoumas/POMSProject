package poms.center.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommonConstants;
import poms.center.dao.IAdviceDao;
import poms.center.dao.IOrderDao;
import poms.center.entity.Advice;
import poms.center.entity.Order;
import poms.center.entity.OrderChange;

@Service("centerAssistService")
public class CenterAssistServiceImpl implements ICenterAssistService{

	@Autowired
	private IAdviceDao adviceDao;
	
	@Autowired
	private IOrderDao orderDao;
	
	
	@Override
	public int insertAdvice(Advice advice) {
		// TODO Auto-generated method stub
		return adviceDao.insertAdvice(advice);
	}

	@Override
	public List<Advice> selectAdviceList(int stationID, int departmentID,int isReaded,int page) {
		// TODO Auto-generated method stub
		List<Advice> adviceList = adviceDao.selectAdviceList(stationID,departmentID,isReaded,page*CommonConstants.PAGE_SIZE);
		for(Advice advice:adviceList){
			advice.setSendDate(adjustDate(advice.getSendDate()));
		}
		return adviceList;
	}

	@Override
	public int correctOrderAddress(int stationID,int orderID, String newAddress) {
		// TODO Auto-generated method stub
		Order order = orderDao.selectOrderByID(stationID, orderID).get(0);
		OrderChange orderChange = new OrderChange();
		orderChange.setOrderID(order.getOrderID());
		orderChange.setOldValue(order.getOrderAddress());
		orderChange.setNewValue(newAddress);
		order.setOrderAddress(newAddress);
		return orderDao.updateOrder(order);
	}

	@Override
	public int finishDeliverd(int stationID, int orderID) {
		// TODO Auto-generated method stub
		Order order = orderDao.selectOrderByID(stationID, orderID).get(0);
		order.setIsDelivered(CommonConstants.DELIVERED);
		return orderDao.updateOrder(order);
	}

	public Date adjustDate(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		return calendar.getTime();
	}

	@Override
	public int setAdviceReaded(int adviceID) {
		// TODO Auto-generated method stub
		return adviceDao.setAdviceReaded(adviceID);
	}

	@Override
	public List<Advice> selectAdviceListByPage(int receiveStationID, int receiveDeptID, int isReaded, int page) {
		// TODO Auto-generated method stub
		return null;
	}
}
