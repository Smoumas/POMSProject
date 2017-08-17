package poms.center.service;

import java.util.Date;
import java.util.List;

import poms.center.entity.Company;
import poms.center.entity.DepartmentDuty;
import poms.center.entity.Order;

public interface ICenterQueryService {

	public List<Order> selectCustomerPeriodOrder(int stationID,int customerID,Date beginDate,Date endDate,int page);
	public List<Order> selectOrderListByNewspaperName(int stationID,String newspaperName,int page);
	public List<Order> selectOrderListByCustomerName(int stationID,String customerName,int page);
	public List<Order> selectOrderByID(int stationID,int orderID);
	
	public Integer orderCount(int stationID,Date orderDate);
	
	public List<Company> selectCompanyInfo();
	
	public List<DepartmentDuty> selectDepartmentDutyInfo(int page);
	
	public List<DepartmentDuty> selectDepartmentDutyInfoByName(String departmentName,int page);
	
}
