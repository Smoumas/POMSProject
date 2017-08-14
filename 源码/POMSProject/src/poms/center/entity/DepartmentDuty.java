package poms.center.entity;

public class DepartmentDuty {
	//部门职务表对应属性,维护部门所拥有的职务
	private Integer departmentID;//部门ID
	private Integer dutyType;//职务ID
	public Integer getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
	}
	public Integer getDutyType() {
		return dutyType;
	}
	public void setDutyType(Integer dutyType) {
		this.dutyType = dutyType;
	}
	
	//对应的get、set方法
	
}
