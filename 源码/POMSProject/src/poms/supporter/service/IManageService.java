package poms.supporter.service;

import java.util.List;

import poms.center.entity.Comment;
import poms.center.entity.Customer;
import poms.center.entity.Operator;

public interface IManageService {
	public int updateCustomer(Customer customer);
	public int deleteCustomer(int customerID);
	public int insertNewCustomer(Customer customer);
	public int setCustomerInvestigation(Comment comment);
	public List<Customer> selectCustomerList(int stationID);
	public List<Comment> selectAllInvestigation(int stationID);
	public List<Comment> selectInvestigationByType(int stationID,int commentType);
	public int changePassword(Operator operator,String newPassword);
}
