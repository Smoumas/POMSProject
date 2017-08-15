package poms.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import poms.center.entity.Customer;
import poms.center.entity.Order;
import poms.center.entity.OrderPay;
import poms.finance.service.BigCustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sakamichi on 2017/8/8.
 */
@Controller
@RequestMapping("/bigCustomer")
@SessionAttributes("stationID")
public class BigCustomerController {
    @Autowired
    private BigCustomerService bigCustomerService;

    @RequestMapping(value="/updatePaymentState",method= RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> updatePaymentState(Order order, OrderPay orderPay, ModelMap map){
        Map<String,Object> resultMap = new HashMap<>();
        int result = bigCustomerService.update(order,orderPay);
        resultMap.put("result",result);
        return resultMap;
    }

    @RequestMapping(value="/queryDebt",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryDebt(@RequestParam("page")int page,ModelMap map){
        Map<String,Object> resultMap = new HashMap<>();
        int customerID = (int)map.get("customerID");

        List<Order> orderList = bigCustomerService.query(customerID,page);
        resultMap.put("size",orderList.size());
        resultMap.put("data",orderList);
        return resultMap;
    }

    @RequestMapping(value="/queryAll",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryAll(ModelMap map){
        Map<String,Object> resultMap = new HashMap<>();
        List<Customer> customerList = bigCustomerService.queryAll();
        resultMap.put("size",customerList.size());
        resultMap.put("data",customerList);
        return resultMap;
    }
}
