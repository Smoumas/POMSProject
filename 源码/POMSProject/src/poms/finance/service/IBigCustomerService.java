package poms.finance.service;

import poms.center.entity.Customer;
import poms.center.entity.Order;
import poms.center.entity.OrderPay;

import java.util.List;

/**
 * Created by sakamichi on 2017/8/7.
 */
public interface IBigCustomerService {
    int update(Order order, OrderPay orderPay);

    List<Order> query(int customerID, int page);

    List<Customer> queryAll();
}
