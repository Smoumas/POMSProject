package poms.center.entity;

public class Newspaper {
	//报刊表对应属性,维护发行的报刊的基本信息
	private int newspaperID;//报刊ID
	private String newspaperName;//报社名称
	private int noID;//所属报社ID
	private int ableUnsubscribe;//是否允许退订
	private int ableRedirect;//是否允许转址
	private int ableDelay;//是否允许延期
	private int frequency;//刊期
	private int issueRate;//发行费率
	
	//对应的get、set方法
	public int getNewspaperID() {
		return newspaperID;
	}
	public void setNewspaperID(int newspaperID) {
		this.newspaperID = newspaperID;
	}
	public String getNewspaperName() {
		return newspaperName;
	}
	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}
	public int getNoID() {
		return noID;
	}
	public void setNoID(int noID) {
		this.noID = noID;
	}
	public int getAbleUnsubscribe() {
		return ableUnsubscribe;
	}
	public void setAbleUnsubscribe(int ableUnsubscribe) {
		this.ableUnsubscribe = ableUnsubscribe;
	}
	public int getAbleRedirect() {
		return ableRedirect;
	}
	public void setAbleRedirect(int ableRedirect) {
		this.ableRedirect = ableRedirect;
	}
	public int getAbleDelay() {
		return ableDelay;
	}
	public void setAbleDelay(int ableDelay) {
		this.ableDelay = ableDelay;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getIssueRate() {
		return issueRate;
	}
	public void setIssueRate(int issueRate) {
		this.issueRate = issueRate;
	}
}
