package poms.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommonConstants;
import poms.center.dao.ICouponDao;
import poms.center.dao.IGiftCardDao;
import poms.center.entity.Coupon;
import poms.center.entity.GiftCard;

@Service("centerBonusService")
public class CenterBonusServiceImpl implements ICenterBonusService{

	@Autowired
	private IGiftCardDao giftCardDao;
	
	@Autowired
	private ICouponDao couponDao;

	@Override
	public int insertGiftCard(GiftCard giftCard) {
		// TODO Auto-generated method stub
		return giftCardDao.insertGiftCard(giftCard);
	}

	@Override
	public int updateGiftCard(GiftCard giftCard) {
		// TODO Auto-generated method stub
		return giftCardDao.updateGiftCard(giftCard);
	}

	@Override
	public int deleteGiftCard(int giftCardID) {
		// TODO Auto-generated method stub
		return giftCardDao.deleteGiftCard(giftCardID);
	}

	@Override
	public List<GiftCard> selectGiftCardList(int page) {
		// TODO Auto-generated method stub
		return giftCardDao.selectGiftCardList(page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<GiftCard> selectGiftCardByID(int giftCardID) {
		// TODO Auto-generated method stub
		return giftCardDao.selectGiftCardByID(giftCardID);
	}

	@Override
	public int insertCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return couponDao.insertCoupon(coupon);
	}

	@Override
	public int updateCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return couponDao.updateCoupon(coupon);
	}

	@Override
	public int deleteCoupon(int couponID) {
		// TODO Auto-generated method stub
		return couponDao.deleteCoupon(couponID);
	}

	@Override
	public List<Coupon> selectCouponList(int page) {
		// TODO Auto-generated method stub
		return couponDao.selectCouponList(page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<Coupon> selectCouponByID(int couponID) {
		// TODO Auto-generated method stub
		return couponDao.selectCouponByID(couponID);
	}

	
}
