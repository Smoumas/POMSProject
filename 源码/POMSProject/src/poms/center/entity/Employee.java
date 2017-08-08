package poms.center.entity;

public class Employee {
	//员工表对应属性,维护员工的基本信息
	private int employeeID;//员工ID
	private String employeeName;//员工姓名
	private int sex;//性别
	private int age;//年龄
	private int stationID;//所属分站ID
	private int departmentID;//所属部门ID
	private int dutyID;//职务ID
	private String phone;//联系方式
	
	//对应的get、set方法
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStationID() {
		return stationID;
	}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public int getDutyID() {
		return dutyID;
	}
	public void setDutyID(int dutyID) {
		this.dutyID = dutyID;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
