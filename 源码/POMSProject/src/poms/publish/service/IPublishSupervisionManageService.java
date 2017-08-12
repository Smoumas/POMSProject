package poms.publish.service;

import java.util.List;

import poms.center.entity.Comment;

public interface IPublishSupervisionManageService {
	
	public List<Comment> selectComplaint(int stationID);
	public List<Comment> selectComplaintByCustomerID(int stationID,int customerID);
	public int insertReceipt(int stationID,int recordID,String receipt);
	public List<Comment> selectPraise(int stationID);
	public List<Comment> selectSuggesion(int stationID);
}
