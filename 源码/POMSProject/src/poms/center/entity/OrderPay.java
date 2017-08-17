package poms.center.entity;

/**
 * Created by sakamichi on 2017/8/14.
 */
public class OrderPay {
    private Integer orderID;
    private Double cash;
    private Double credit;
    private Integer giftCardID;
    private Integer couponID;
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public Double getCash() {
		return cash;
	}
	public void setCash(Double cash) {
		this.cash = cash;
	}
	public Double getCredit() {
		return credit;
	}
	public void setCredit(Double credit) {
		this.credit = credit;
	}
	public Integer getGiftCardID() {
		return giftCardID;
	}
	public void setGiftCardID(Integer giftCardID) {
		this.giftCardID = giftCardID;
	}
	public Integer getCouponID() {
		return couponID;
	}
	public void setCouponID(Integer couponID) {
		this.couponID = couponID;
	}

    
}
