package poms.center.service;

import java.util.List;

import poms.center.entity.Advice;

public interface ICenterAssistService {

	
	public int insertAdvice(Advice advice);
	public List<Advice> selectAdviceList(int stationID,int departmentID,int isReaded);
	public int correctOrderAddress(int stationID,int orderID,String newAddress);
	public int finishDeliverd(int stationID,int orderID);
	
 }
