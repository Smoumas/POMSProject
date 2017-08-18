package poms.publish.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.ModifyTypeConstants;
import poms.center.entity.Coupon;
import poms.center.entity.GiftCard;
import poms.center.entity.Order;
import poms.center.entity.OrderChange;
import poms.center.service.ICenterOrderService;

@Service("publishProductOrderService")
public class PublishProductOrderServiceImpl implements IPublishProductOrderService{

	@Autowired
	private ICenterOrderService centerOrderService;
	
	
	
	@Override
	public int newOrder(Order order) {
		// TODO Auto-generated method stub
		return centerOrderService.insertOrder(order);
	}

	@Override
	
	public int deleteOrder(int stationID,int orderID) {
		// TODO Auto-generated method stub
		return centerOrderService.deleteOrder(stationID,orderID);
	}

	@Override
	public int changeAddress(int stationID,int orderID, String newAddress) {
		// TODO Auto-generated method stub
		Order order = centerOrderService.selectOrderByID(stationID, orderID).get(0);
		OrderChange orderChange = new OrderChange();
		orderChange.setOrderID(order.getOrderID());
		orderChange.setOldValue(order.getOrderAddress());
		orderChange.setNewValue(newAddress);
		orderChange.setChangeType(ModifyTypeConstants.REDIRECT);
		centerOrderService.insertOrderChange(orderChange);
		order.setOrderAddress(newAddress);
		return centerOrderService.updateOrder(order);
	}

	@Override
	public int postpone(int stationID,int orderID, Date date) {
		// TODO Auto-generated method stub
		System.out.println("StationID:"+stationID);
		System.out.println("orderID:"+orderID);
		Order order = centerOrderService.selectOrderByID(stationID, orderID).get(0);
		OrderChange orderChange = new OrderChange();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		orderChange.setOrderID(order.getOrderID());
		orderChange.setOldValue(simpleDateFormat.format(order.getDeliverDate()));
		orderChange.setNewValue(simpleDateFormat.format(date));
		orderChange.setChangeType(ModifyTypeConstants.POSTPONE);
		centerOrderService.insertOrderChange(orderChange);
		order.setDeliverDate(date);
		return centerOrderService.updateOrder(order);
	}

	@Override
	public int renewSubscription(int stationID,int orderID,int orderKeepTime) {
		// TODO Auto-generated method stub
		Order newOrder = centerOrderService.selectOrderByID(stationID, orderID).get(0);
		newOrder.setOrderKeepTime(newOrder.getOrderKeepTime()+orderKeepTime);
		return centerOrderService.updateOrder(newOrder);
	}

	@Override
	public List<GiftCard> additionalDonationByGiftCard(int newspaperID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Coupon> additionalDonationByCoupon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> selectOrderByID(int stationID,int orderID) {
		// TODO Auto-generated method stub
		return centerOrderService.selectOrderByID(stationID, orderID);
	}

	@Override
	public List<Order> orderList(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerOrderService.selectAllOrder(stationID,page);
	}

}
