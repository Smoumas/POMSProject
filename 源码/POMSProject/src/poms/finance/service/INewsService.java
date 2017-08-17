package poms.finance.service;

import poms.center.entity.DeliverAreaCustomer;
import poms.center.entity.NewspaperCount;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by sakamichi on 2017/8/7.
 */
public interface INewsService {
    Map<String, Object> getSumByPeriod(Date startDate, Date endDate, int stationID);

    List<DeliverAreaCustomer> getCustomerArea(int stationID, int page);

    List<NewspaperCount> getDeliverSum();

    double NewsOfficeBalance();

    double stationBalance();
}
