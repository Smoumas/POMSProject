package poms.center.entity;

public class Department {
	//部门表对应属性,存储部门基本信息
	private int departmentID;//部门ID
	private String departmentName;//部门名称
	private int stationID;//所属分站ID
	
	//对应的get、set方法
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getStationID() {
		return stationID;
	}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}
	
	
}
