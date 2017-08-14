package poms.center.entity;

public class TransferCom {
	//运输单位表对应属性,维护运输公司基本信息
	private Integer companyID;//运输公司ID
	private String companyName;//运输公司名称
	private String phone;//联系方式
	private String address;//运输公司地址
	public Integer getCompanyID() {
		return companyID;
	}
	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//对应的get、set方法
	
}
