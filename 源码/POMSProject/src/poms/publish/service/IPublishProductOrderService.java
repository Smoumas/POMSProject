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
	public int renewSubscription(int stationID,Order order);		//续订
	public List<GiftCard> additionalDonationByGiftCard(int newspaperID);
	public List<Coupon> additionalDonationByCoupon();
}
