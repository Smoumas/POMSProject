package poms.finance.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.DeliverAreaCustomer;
import poms.center.entity.NewspaperCount;
import poms.finance.service.NewsService;

/**
 * Created by sakamichi on 2017/8/8.
 */
@Controller
@RequestMapping("/news")
@SessionAttributes("stationID")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping(value="/sumAccount",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> sumAccoutByPeriod(ModelMap map){
        Map<String,Object> modelMap = new HashMap<>();

        return modelMap;
    }

    @RequestMapping(value="/deliverAccount",method= RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> newsDeliverAccount(ModelMap map){
    	Map<String,Object> resultMap = new HashMap<String, Object>();
    	List<NewspaperCount> countList = newsService.getDeliverSum();
    	resultMap.put("size", countList);
    	resultMap.put("data", countList);
    	return resultMap;
    }

    @RequestMapping(value="/balanceNO",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> balanceNO(ModelMap map){
        Map<String,Object> modelMap = new HashMap<>();

        return modelMap;
    }

    @RequestMapping(value="/balanceStation",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> balanceStation(ModelMap map){
        Map<String,Object> modelMap = new HashMap<>();

        return modelMap;
    }

    @RequestMapping(value="/querySettlement",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> querySettlement(ModelMap map){
        Map<String,Object> modelMap = new HashMap<>();

        return modelMap;
    }
    
    @RequestMapping(value="/customerArea",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> customerArea(ModelMap map){
    	int stationID = (Integer)map.get("stationID");
    	List<DeliverAreaCustomer> customerAreaList = newsService.getCustomerArea(stationID);
    	Map<String,Object> resultMap = new HashMap<String, Object>();
    	resultMap.put("size", customerAreaList.size());
    	resultMap.put("data", customerAreaList);
    	return resultMap;
    }
}
