package poms.finance.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.DeliverAreaCustomer;
import poms.center.entity.NewspaperCount;
import poms.center.entity.Station;
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
	
	
    public List<Double> getSumByPeriod(Date start,Date end){
        return null;
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
