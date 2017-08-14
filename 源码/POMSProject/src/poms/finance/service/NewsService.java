package poms.finance.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.DeliverAreaCustomer;
import poms.center.entity.NewspaperCount;
import poms.center.service.ICenterCustomerService;
import poms.center.service.ICenterOrderService;

/**
 * Created by sakamichi on 2017/8/8.
 */
@Service("newsService")
public class NewsService {

	@Autowired
	private ICenterCustomerService centerCustomerService;
	
	@Autowired
	private ICenterOrderService centerOrderService;
	
	
    public Map<String, Double> getSumByPeriod(Date startDate, Date endDate, int stationID){
        return centerOrderService.selectSumByPeriod(startDate,endDate,stationID);
    }

    public List<DeliverAreaCustomer> getCustomerArea(int stationID){
        return centerCustomerService.selectDeliverAreaCustomer(stationID);
    }

    public List<NewspaperCount> getDeliverSum(){
    	return centerOrderService.selectNewspaperCount();
    }

    public double NewsOfficeBalance(){
        return 0;
    }

    public double stationBalance(){
        return 0;
    }
}
