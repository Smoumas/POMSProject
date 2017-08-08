package poms.center.entity;

public class DeliverManage {
	//投递管理表,维护投递员和投递段的关系
	private int deliverID;		//投递员ID
	private int deliverAreaID;	//投递段ID
	
	//对应的get、set方法
	public int getDeliverID() {
		return deliverID;
	}
	public void setDeliverID(int deliverID) {
		this.deliverID = deliverID;
	}
	public int getDeliverAreaID() {
		return deliverAreaID;
	}
	public void setDeliverAreaID(int deliverAreaID) {
		this.deliverAreaID = deliverAreaID;
	}
	
}
