package poms.center.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GiftCard {
	//赠卡表对应属性
	private int giftCardID;//赠卡ID
	private int newspaperID;//对应的报刊ID
	private Date startDate;//起始日期
	private Date endDate;//结束日期
	private int isUsed;//是否被使用
	
	//对应的get、set方法
	public int getGiftCardID() {
		return giftCardID;
	}
	public void setGiftCardID(int giftCardID) {
		this.giftCardID = giftCardID;
	}
	public int getNewspaperID() {
		return newspaperID;
	}
	public void setNewspaperID(int newspaperID) {
		this.newspaperID = newspaperID;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}
	
	
}
