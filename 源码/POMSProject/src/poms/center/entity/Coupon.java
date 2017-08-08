package poms.center.entity;

public class Coupon {
	//代金券表对应属性,维护代金券基本信息
	private int couponID;//代金券ID
	private float price;//代金券金额
	private int isUsed;//是否被使用
	
	//对应的get、set方法
	public int getCouponID() {
		return couponID;
	}
	public void setCouponID(int couponID) {
		this.couponID = couponID;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}
	
	
}
