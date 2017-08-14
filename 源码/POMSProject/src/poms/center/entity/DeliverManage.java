package poms.center.entity;

public class DeliverManage {
	//投递管理表,维护投递员和投递段的关系
	private Integer deliverID;		//投递员ID
	private Integer deliverAreaID;	//投递段ID
	public Integer getDeliverID() {
		return deliverID;
	}
	public void setDeliverID(Integer deliverID) {
		this.deliverID = deliverID;
	}
	public Integer getDeliverAreaID() {
		return deliverAreaID;
	}
	public void setDeliverAreaID(Integer deliverAreaID) {
		this.deliverAreaID = deliverAreaID;
	}
	
	//对应的get、set方法

	
}
