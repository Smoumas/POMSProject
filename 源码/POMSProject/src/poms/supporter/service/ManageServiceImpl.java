package poms.supporter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Comment;
import poms.center.entity.Customer;
import poms.center.entity.Operator;
import poms.center.service.ICenterCustomerService;
import poms.center.service.ICenterPersonManageService;

@Service("manageService")
public class ManageServiceImpl implements IManageService{

	@Autowired
	private ICenterCustomerService centerCustomerService;
	
	@Autowired
	private ICenterPersonManageService centerPersonManageService;
	
	@Override
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return centerCustomerService.updateCustomer(customer);
	}

	@Override
	public int deleteCustomer(int customerID) {
		// TODO Auto-generated method stub
		return centerCustomerService.deleteCustomer(customerID);
	}

	@Override
	public int insertNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return centerCustomerService.insertNewCustomer(customer);
	}

	@Override
	public int setCustomerInvestigation(Comment comment) {
		// TODO Auto-generated method stub
		return centerCustomerService.setCustomerInvestigation(comment);
	}

	@Override
	public List<Comment> selectAllInvestigation(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerCustomerService.selectAllInvestigation(stationID,page);
	}

	@Override
	public List<Comment> selectInvestigationByType(int stationID,int commentType) {
		// TODO Auto-generated method stub
		return centerCustomerService.selectInvestigationByType(stationID, commentType);
	}

	@Override
	public List<Customer> selectCustomerList(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerCustomerService.selectCustomerList(stationID,page);
	}

	@Override
	public int changePassword(Operator operator, String newPassword) {
		// TODO Auto-generated method stub
		operator.setPassword(newPassword);
		return centerPersonManageService.updateOperator(operator);
	}

	@Override
	public int insertReceipt(int stationID, int recordID, String receipt) {
		// TODO Auto-generated method stub
		Comment comment = centerCustomerService.selectCommentByID(stationID, recordID).get(0);
		comment.setReceipt(receipt);
		return centerCustomerService.updateComment(comment);
	}
	
}
