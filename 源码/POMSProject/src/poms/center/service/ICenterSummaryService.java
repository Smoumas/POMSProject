package poms.center.service;

import java.util.List;

import poms.center.entity.OrderCount;

public interface ICenterSummaryService {

	public List<OrderCount> orderCountListGroupByStation();
	
	
}
