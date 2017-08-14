package poms.center.entity;

public class Newspaper {
	//报刊表对应属性,维护发行的报刊的基本信息
	private Integer newspaperID;//报刊ID
	private String newspaperName;//报社名称
	private Integer noID;//所属报社ID
	private Integer ableUnsubscribe;//是否允许退订
	private Integer ableRedirect;//是否允许转址
	private Integer ableDelay;//是否允许延期
	private Integer frequency;//刊期
	private Integer issueRate;//发行费率
	public Integer getNewspaperID() {
		return newspaperID;
	}
	public void setNewspaperID(Integer newspaperID) {
		this.newspaperID = newspaperID;
	}
	public String getNewspaperName() {
		return newspaperName;
	}
	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}
	public Integer getNoID() {
		return noID;
	}
	public void setNoID(Integer noID) {
		this.noID = noID;
	}
	public Integer getAbleUnsubscribe() {
		return ableUnsubscribe;
	}
	public void setAbleUnsubscribe(Integer ableUnsubscribe) {
		this.ableUnsubscribe = ableUnsubscribe;
	}
	public Integer getAbleRedirect() {
		return ableRedirect;
	}
	public void setAbleRedirect(Integer ableRedirect) {
		this.ableRedirect = ableRedirect;
	}
	public Integer getAbleDelay() {
		return ableDelay;
	}
	public void setAbleDelay(Integer ableDelay) {
		this.ableDelay = ableDelay;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	public Integer getIssueRate() {
		return issueRate;
	}
	public void setIssueRate(Integer issueRate) {
		this.issueRate = issueRate;
	}
	
	//对应的get、set方法
	
}
