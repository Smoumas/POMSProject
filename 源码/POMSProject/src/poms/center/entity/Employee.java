package poms.center.entity;

public class Employee {
	//员工表对应属性,维护员工的基本信息
	private Integer employeeID;//员工ID
	private String employeeName;//员工姓名
	private Integer sex;//性别
	private Integer age;//年龄
	private Integer stationID;//所属分站ID
	private Integer departmentID;//所属部门ID
	private Integer dutyID;//职务ID
	private String phone;//联系方式
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getStationID() {
		return stationID;
	}
	public void setStationID(Integer stationID) {
		this.stationID = stationID;
	}
	public Integer getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
	}
	public Integer getDutyID() {
		return dutyID;
	}
	public void setDutyID(Integer dutyID) {
		this.dutyID = dutyID;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//对应的get、set方法
	
}
