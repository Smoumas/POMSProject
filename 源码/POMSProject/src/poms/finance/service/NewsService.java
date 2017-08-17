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
public class NewsService implements INewsService {

	@Autowired
	private ICenterCustomerService centerCustomerService;
	
	@Autowired
	private ICenterOrderService centerOrderService;

    @Override
    public Map<String, Object> getSumByPeriod(Date startDate, Date endDate, int stationID){
        return centerOrderService.selectSumByPeriod(startDate,endDate,stationID);
    }

    @Override
    public List<DeliverAreaCustomer> getCustomerArea(int stationID,int page){
        return centerCustomerService.selectDeliverAreaCustomer(stationID,page);
    }

    @Override
    public List<NewspaperCount> getDeliverSum(){
    	return centerOrderService.selectNewspaperCount();
    }

    @Override
    public double NewsOfficeBalance(){
        return 0;
    }

    @Override
    public double stationBalance(){
        return 0;
    }
}
