package poms.center.entity;

public class Coupon {
	//代金券表对应属性,维护代金券基本信息
	private Integer couponID;//代金券ID
	private float price;//代金券金额
	private Integer isUsed;//是否被使用
	public Integer getCouponID() {
		return couponID;
	}
	public void setCouponID(Integer couponID) {
		this.couponID = couponID;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
	}
	
	//对应的get、set方法
	
	
}
