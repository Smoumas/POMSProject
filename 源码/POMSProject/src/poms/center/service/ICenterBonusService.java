package poms.center.service;

import java.util.List;

import poms.center.entity.Coupon;
import poms.center.entity.GiftCard;

public interface ICenterBonusService {

	public int insertGiftCard(GiftCard giftCard);
	public int updateGiftCard(GiftCard giftCard);
	public int deleteGiftCard(int giftCardID);
	public List<GiftCard> selectGiftCardList(int page);
	public List<GiftCard> selectGiftCardByID(int giftCardID);
	
	public int insertCoupon(Coupon coupon);
	public int updateCoupon(Coupon coupon);
	public int deleteCoupon(int couponID);
	public List<Coupon> selectCouponList(int page);
	public List<Coupon> selectCouponByID(int couponID);
	
}
