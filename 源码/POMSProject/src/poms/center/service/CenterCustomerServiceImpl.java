package poms.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommonConstants;
import poms.center.dao.ICommentDao;
import poms.center.dao.ICustomerDao;
import poms.center.entity.Comment;
import poms.center.entity.Customer;
import poms.center.entity.DeliverAreaCustomer;
import poms.center.entity.Order;

@Service("centerCustomerService")
public class CenterCustomerServiceImpl implements ICenterCustomerService{

	@Autowired
	private ICustomerDao customerDao;
	
	@Autowired
	private ICommentDao commentDao;
	
	@Override
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

	@Override
	public int deleteCustomer(int customerID) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomerByID(customerID);
	}

	@Override
	public int insertNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.insertCustomer(customer);
	}

	@Override
	public int setCustomerInvestigation(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.insertComment(comment);
	}

	@Override
	public List<Customer> selectCustomerList(int stationID,int page) {
		// TODO Auto-generated method stub
		return customerDao.selectAllCustomer(stationID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<Comment> selectAllInvestigation(int stationID,int page) {
		// TODO Auto-generated method stub
		return commentDao.selectAllComment(stationID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<Comment> selectInvestigationByType(int stationID, int commentType) {
		// TODO Auto-generated method stub
		return commentDao.selectCommentByType(stationID, commentType);
	}

	@Override
	public List<Comment> selectCommentByID(int stationID, int recordID) {
		// TODO Auto-generated method stub
		return commentDao.selectCommentByID(stationID, recordID);
	}

	@Override
	public int updateComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.updateComment(comment);
	}

	@Override
	public List<Comment> selectCommentByTypeAndCustomerID(int stationID, int customerID, int commentType) {
		// TODO Auto-generated method stub
		return commentDao.selectCommentByTypeAndCustomerID(stationID, customerID, commentType);
	}

	@Override
	public List<DeliverAreaCustomer> selectDeliverAreaCustomer(int stationID,int page) {
		// TODO Auto-generated method stub
		return customerDao.selectDeliverAreaCustomer(stationID,page*CommonConstants.PAGE_SIZE);
	}
	
	@Override
	public List<Order> selectDebtByCustomer(int customerID,int page) {
		// TODO Auto-generated method stub
		return customerDao.selectCustomerDebt(customerID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<Customer> selectAllBigCustomer() {
		// TODO Auto-generated method stub
		return customerDao.selectBigCustomer();
	}

	@Override
	public List<Comment> selectAllCommentByPage(int stationID, int page) {
		// TODO Auto-generated method stub
		return commentDao.selectAllCommentByPage(stationID, page*CommonConstants.PAGE_SIZE);
	}
	
	
}
