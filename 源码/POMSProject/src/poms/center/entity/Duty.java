package poms.center.entity;

public class Duty {
	//职务表对应属性,维护基本职务类别
	private Integer dutyType;//职务ID
	private String dutyName;//职务名称
	public Integer getDutyType() {
		return dutyType;
	}
	public void setDutyType(Integer dutyType) {
		this.dutyType = dutyType;
	}
	public String getDutyName() {
		return dutyName;
	}
	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}
	
	//对应的get、set方法
	
}
