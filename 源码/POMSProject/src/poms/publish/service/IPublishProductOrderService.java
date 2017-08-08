package poms.publish.service;

import java.util.Date;

import poms.center.entity.Coupon;
import poms.center.entity.GiftCard;
import poms.center.entity.Order;

public interface IPublishProductOrderService {
	public int newOrder(Order order);
	public int deleteOrder(int orderID);
	public int changeAddress(int orderID,String newAddress);
	public int postpone(int orderID,Date date);		//延期交付
	public int renewSubscription(Order order);		//续订
	public GiftCard additionalDonationByGiftCard(int newspaperID);
	public Coupon additionalDonationByCoupon();
}
