package poms.center.entity;

public class DepartmentDuty {
	//部门职务表对应属性,维护部门所拥有的职务
	private Integer departmentID;//部门ID
	private String departmentName;
	private String dutyName;  
	private Integer wage;

	//对应的get、set方法
	public Integer getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
	}
	
	public String getDutyName() {
		return dutyName;
	}
	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Integer getWage() {
		return wage;
	}
	public void setWage(Integer wage) {
		this.wage = wage;
	}
	
	
	
}
