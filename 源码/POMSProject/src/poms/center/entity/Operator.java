package poms.center.entity;

public class Operator {
	//操作员表对应属性,维护操作员信息
	private int operatorID;//操作员帐号
	private String password;//操作员密码
	private int level;//操作权限
	private int employeeID;//操作员对应员工ID
	
	//对应的get、set方法
	public int getOperatorID() {
		return operatorID;
	}
	public void setOperatorID(int operatorID) {
		this.operatorID = operatorID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
}
