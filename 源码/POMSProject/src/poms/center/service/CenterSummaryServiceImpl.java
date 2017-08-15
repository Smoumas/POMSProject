package poms.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommonConstants;
import poms.center.dao.IOrderDao;
import poms.center.entity.OrderCount;

@Service("centerSummaryService")
public class CenterSummaryServiceImpl implements ICenterSummaryService{

	
	@Autowired
	private IOrderDao orderDao;
	
	@Override
	public List<OrderCount> orderCountListGroupByStation(int page) {
		// TODO Auto-generated method stub
		return orderDao.selectOrderCountGroupByStation(page*CommonConstants.PAGE_SIZE);
	}

	
}
