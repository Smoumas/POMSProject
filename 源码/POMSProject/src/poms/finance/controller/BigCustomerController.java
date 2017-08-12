package poms.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sakamichi on 2017/8/8.
 */
@Controller
@RequestMapping("/bigCustomer")
@SessionAttributes("stationID")
public class BigCustomerController {

    @RequestMapping(value="/updatePaymentState",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> updatePaymentState(ModelMap map){
        Map<String,Object> modelMap = new HashMap<>();

        return modelMap;
    }

    @RequestMapping(value="/queryDebt",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryDebt(ModelMap map){
        Map<String,Object> modelMap = new HashMap<>();

        return modelMap;
    }
}
