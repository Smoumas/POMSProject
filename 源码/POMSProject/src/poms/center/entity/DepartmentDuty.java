package poms.center.entity;

public class DepartmentDuty {
	//部门职务表对应属性,维护部门所拥有的职务
	private int departmentID;//部门ID
	private int dutyType;//职务ID
	
	//对应的get、set方法
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public int getDutyType() {
		return dutyType;
	}
	public void setDutyType(int dutyType) {
		this.dutyType = dutyType;
	}
}
