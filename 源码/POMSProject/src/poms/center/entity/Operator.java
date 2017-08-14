package poms.center.entity;

public class Operator {
	//操作员表对应属性,维护操作员信息
	private Integer operatorID;//操作员帐号
	private String password;//操作员密码
	private Integer level;//操作权限
	private Integer employeeID;//操作员对应员工ID

	//对应的get、set方法
	public Integer getOperatorID() {
		return operatorID;
	}
	public void setOperatorID(Integer operatorID) {
		this.operatorID = operatorID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	
	
}
