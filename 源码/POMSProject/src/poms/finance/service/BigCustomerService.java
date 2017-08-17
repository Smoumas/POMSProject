package poms.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import poms.center.entity.Customer;
import poms.center.entity.Order;
import poms.center.entity.OrderPay;
import poms.center.service.ICenterCustomerService;
import poms.center.service.ICenterOrderService;

import java.util.List;


/**
 * Created by sakamichi on 2017/8/8.
 */
@Service("bigCustomerService")
public class BigCustomerService implements IBigCustomerService {
    @Autowired
    private ICenterCustomerService centerCustomerService;
    @Autowired
    private ICenterOrderService centerOrderService;

    @Override
    
    public int update(Order order, OrderPay orderPay){
        if(centerOrderService.updateOrder(order)==0){return 0;}
        return centerOrderService.updateOrderPay(orderPay);
    }

    @Override
    public List<Order> query(int customerID,int page){
        return centerCustomerService.selectDebtByCustomer(customerID,page);
    }
    @Override
    public List<Customer> queryAll(){
        return centerCustomerService.selectAllBigCustomer();
    }
}
