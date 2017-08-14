package poms.publish.service;

import java.util.List;

import poms.center.entity.Advice;
import poms.center.entity.Operator;

public interface IPublishAssistService {
	public List<Advice> getUnreadedAdvice(int stationID,int departmentID);
	public int sendAdvice(Advice advice);
	public List<Advice> getReadedAdvice(int stationID,int departmentID);
	public int changePassword(Operator operator,String newPassword);
}
