package poms.publish.service;

import java.util.Date;
import java.util.List;

import poms.center.entity.Coupon;
import poms.center.entity.GiftCard;
import poms.center.entity.Order;

public interface IPublishProductOrderService {
	public int newOrder(Order order);
	public int deleteOrder(int stationID,int orderID);
	public int changeAddress(int stationID,int orderID,String newAddress);
	public int postpone(int stationID,int orderID,Date date);		//延期交付
	public int renewSubscription(int stationID,int orderID,int orderKeepTime);		//续订
	public List<GiftCard> additionalDonationByGiftCard(int newspaperID);
	public List<Coupon> additionalDonationByCoupon();
	public List<Order> orderList(int stationID,int page);
	public List<Order> selectOrderByID(int stationID,int orderID);
}
