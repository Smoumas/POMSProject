package poms.deliver.service;

import java.util.List;

import poms.center.entity.Advice;

public interface IDeliverAdviceService {
	public int insertAdvice(Advice advice);

	public List<Advice> selectAdviceList(int receiveStationID,int receiveDeptID,int isReaded);
}
