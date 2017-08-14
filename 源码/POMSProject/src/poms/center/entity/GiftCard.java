package poms.center.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GiftCard {
	//赠卡表对应属性
	private Integer giftCardID;//赠卡ID
	private Integer newspaperID;//对应的报刊ID
	private Date startDate;//起始日期
	private Date endDate;//结束日期
	private Integer isUsed;//是否被使用
	
	//对应的get、set方法
	
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getStartDate() {
		return startDate;
	}
	public Integer getGiftCardID() {
		return giftCardID;
	}
	public void setGiftCardID(Integer giftCardID) {
		this.giftCardID = giftCardID;
	}
	public Integer getNewspaperID() {
		return newspaperID;
	}
	public void setNewspaperID(Integer newspaperID) {
		this.newspaperID = newspaperID;
	}
	public Integer getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
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
	
	
}
