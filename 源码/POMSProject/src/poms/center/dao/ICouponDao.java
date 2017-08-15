package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Coupon;

public interface ICouponDao {
	
	public int insertCoupon(Coupon coupon);
	public int updateCoupon(Coupon coupon);
	public int deleteCoupon(@Param("couponID") int couponID);
	public List<Coupon> selectCouponList(@Param("begin") int begin);
	public List<Coupon> selectCouponByID(@Param("couponID") int couponID);
}
