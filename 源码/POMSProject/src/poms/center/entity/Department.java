package poms.center.entity;

public class Department {
	//部门表对应属性,存储部门基本信息
	private Integer departmentID;//部门ID
	private String departmentName;//部门名称
	private Integer stationID;//所属分站ID
	public Integer getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Integer getStationID() {
		return stationID;
	}
	public void setStationID(Integer stationID) {
		this.stationID = stationID;
	}
	
	//对应的get、set方法

	
	
}
