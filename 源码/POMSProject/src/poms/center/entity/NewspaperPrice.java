package poms.center.entity;

public class NewspaperPrice {
	//报刊报价表对应属性,维护报刊定价信息
	private Integer newspaperID;		//报刊ID
	private float dayPrice;			//报刊日价
	private float mouthPrice;		//报刊月价
	private float seasonPrice;		//报刊季价
	private float halfYearPrice;	//报刊半年价
	private float yearPrice;		//报刊年价
	private float baseDiscount;		//折扣基础倍率
	
	//对应的get、set方法
	
	public float getDayPrice() {
		return dayPrice;
	}
	public Integer getNewspaperID() {
		return newspaperID;
	}
	public void setNewspaperID(Integer newspaperID) {
		this.newspaperID = newspaperID;
	}
	public void setDayPrice(float dayPrice) {
		this.dayPrice = dayPrice;
	}
	public float getMouthPrice() {
		return mouthPrice;
	}
	public void setMouthPrice(float mouthPrice) {
		this.mouthPrice = mouthPrice;
	}
	public float getSeasonPrice() {
		return seasonPrice;
	}
	public void setSeasonPrice(float seasonPrice) {
		this.seasonPrice = seasonPrice;
	}
	public float getHalfYearPrice() {
		return halfYearPrice;
	}
	public void setHalfYearPrice(float halfYearPrice) {
		this.halfYearPrice = halfYearPrice;
	}
	public float getYearPrice() {
		return yearPrice;
	}
	public void setYearPrice(float yearPrice) {
		this.yearPrice = yearPrice;
	}
	public float getBaseDiscount() {
		return baseDiscount;
	}
	public void setBaseDiscount(float baseDiscount) {
		this.baseDiscount = baseDiscount;
	}
	
}
