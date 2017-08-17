package poms.supporter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Department;
import poms.center.entity.Log;
import poms.center.entity.Order;
import poms.center.entity.Station;
import poms.center.service.ICenterDictionaryMaintainService;

@Service("queryService")
public class QueryServiceImpl implements IQueryService{

	
	@Autowired
	private ICenterDictionaryMaintainService centerDictionaryMaintainService;
	
	@Override
	public List<Order> selectExpiredOrder(int stationID) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setOrderID(456);
		order.setNewspaperID(1);
		order.setCustomerID(123);
		order.setStationID(2);
		order.setOrderType(3);
		order.setOrderAddress("Address Test");
		order.setOrderNum(9);
		order.setDeliverAreaID(123);
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order);
		return orderList;
	}

	@Override
	public List<Log> selectOperateLog(int stationID, String beginDate, String endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Station> stationList(int page) {
		// TODO Auto-generated method stub
		return centerDictionaryMaintainService.stationList(page);
	}

	@Override
	public List<Department> selectDepartmentList(int stationID, int page) {
		// TODO Auto-generated method stub
		return centerDictionaryMaintainService.selectDepartmentList(stationID, page);
	}

}
