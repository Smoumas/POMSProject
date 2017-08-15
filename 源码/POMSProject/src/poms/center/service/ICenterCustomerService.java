package poms.center.service;

import java.util.List;


import poms.center.entity.Comment;
import poms.center.entity.Customer;
import poms.center.entity.DeliverAreaCustomer;
import poms.center.entity.Order;

public interface ICenterCustomerService {

	public int updateCustomer(Customer customer);
	public int deleteCustomer(int customerID);
	public int insertNewCustomer(Customer customer);
	public int setCustomerInvestigation(Comment comment);
	
	public List<Customer> selectCustomerList(int stationID,int page);
	public List<Comment> selectAllInvestigation(int stationID,int page);
	public List<Comment> selectInvestigationByType(int stationID,int commentType);
	public List<Comment> selectCommentByID(int stationID,int recordID);
	public int updateComment(Comment comment);
	
	public List<Comment> selectCommentByTypeAndCustomerID(int stationID,int customerID,int commentType);
	
	public List<DeliverAreaCustomer> selectDeliverAreaCustomer(int stationID,int page);

	public List<Order> selectDebtByCustomer(int customerID,int page);

	public List<Customer> selectAllBigCustomer();
	
	public List<Comment> selectAllCommentByPage(int stationID,int page);
	
	
}
