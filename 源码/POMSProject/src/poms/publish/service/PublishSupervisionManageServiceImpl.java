package poms.publish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommentTypeConstants;
import poms.center.entity.Comment;
import poms.center.service.ICenterCustomerService;

@Service("publishSupervisionManageService")
public class PublishSupervisionManageServiceImpl implements IPublishSupervisionManageService{
	
	@Autowired
	private ICenterCustomerService centerCustomerService;
	
	@Override
	public List<Comment> selectComplaint(int stationID) {
		// TODO Auto-generated method stub
		return centerCustomerService.selectInvestigationByType(stationID, CommentTypeConstants.COMPLAINT);
	}

	@Override
	public List<Comment> selectComplaintByCustomerID(int stationID, int customerID) {
		// TODO Auto-generated method stub
		return centerCustomerService.selectCommentByTypeAndCustomerID(stationID, customerID, CommentTypeConstants.COMPLAINT);
	}

	@Override
	public int insertReceipt(int stationID,int recordID, String receipt) {
		// TODO Auto-generated method stub
		Comment comment = centerCustomerService.selectCommentByID(stationID, recordID).get(0);
		comment.setReceipt(receipt);
		return centerCustomerService.updateComment(comment);
	}

	@Override
	public List<Comment> selectPraise(int stationID) {
		// TODO Auto-generated method stub
		return centerCustomerService.selectInvestigationByType(stationID, CommentTypeConstants.PRAISE);
	}

	@Override
	public List<Comment> selectSuggesion(int stationID) {
		// TODO Auto-generated method stub
		return centerCustomerService.selectInvestigationByType(stationID, CommentTypeConstants.SUGGESTION);
	}

}
