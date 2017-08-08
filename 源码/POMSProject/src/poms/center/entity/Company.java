package poms.center.entity;

public class Company {
	//公司表对应属性,维护该发行公司基本信息
	private String companyName;//公司名称
	private String businessScope;//公司业务范围
	private String phone;//联系方式
	
	//对应的get、set方法
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getBusinessScope() {
		return businessScope;
	}
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
