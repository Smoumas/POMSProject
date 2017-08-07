package poms.supporter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import poms.center.entity.Comment;
import poms.center.entity.Customer;

@Service("manageService")
public class ManageServiceImpl implements IManageService{

	@Override
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
			
		return 0;
	}

	@Override
	public int deleteCustomer(int customerID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setCustomerInvestigation(Comment comment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Comment> selectAllInvestigation(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> selectInvestigationByType(int stationID,int commentType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> selectCustomerList(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int changePassword(int operatorID, String newPassword) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
