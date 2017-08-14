package poms.center.entity;

/**
 * Created by sakamichi on 2017/8/14.
 */
public class OrderPay {
    private int orderID;
    private double cash;
    private double credit;
    private int giftCardID;
    private int couponID;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getGiftCardID() {
        return giftCardID;
    }

    public void setGiftCardID(int giftCardID) {
        this.giftCardID = giftCardID;
    }

    public int getCouponID() {
        return couponID;
    }

    public void setCouponID(int couponID) {
        this.couponID = couponID;
    }
}
