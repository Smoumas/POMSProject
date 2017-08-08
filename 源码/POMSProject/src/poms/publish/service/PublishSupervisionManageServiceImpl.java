package poms.publish.service;

import java.util.List;

import org.springframework.stereotype.Service;

import poms.center.entity.Comment;

@Service("publishSupervisionManageService")
public class PublishSupervisionManageServiceImpl implements IPublishSupervisionManageService{

	@Override
	public List<Comment> selectComplaint(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> selectComplaintByCustomerID(int stationID, int customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertReceipt(int recordID, String receipt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Comment> selectPraise(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> selectSuggesion(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

}
