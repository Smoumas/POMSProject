package poms.publish.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import poms.center.entity.Coupon;
import poms.center.entity.GiftCard;
import poms.center.entity.Order;

@Service("publishProductOrderService")
public class PublishProductOrderServiceImpl implements IPublishProductOrderService{

	@Override
	public int newOrder(Order order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOrder(int orderID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeAddress(int orderID, String newAddress) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int postpone(int orderID, Date date) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int renewSubscription(Order order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GiftCard additionalDonationByGiftCard(int newspaperID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coupon additionalDonationByCoupon() {
		// TODO Auto-generated method stub
		return null;
	}

}
