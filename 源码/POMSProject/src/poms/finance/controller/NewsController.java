package poms.finance.controller;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

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
    public Map<String, Object> sumAccoutByPeriod(ModelMap map){
        return newsService.getSumByPeriod((Date)map.get("startDate"),(Date)map.get("endDate"),(int)map.get("stationID"));
    }

    @RequestMapping(value="/deliverAccount",method= RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> newsDeliverAccount(ModelMap map){
    	Map<String,Object> resultMap = new HashMap<>();
    	List<NewspaperCount> countList = newsService.getDeliverSum();
    	resultMap.put("size", countList.size());
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
    public Map<String,Object> customerArea(@RequestParam("page")int page,ModelMap map){
    	int stationID = (Integer)map.get("stationID");
    	List<DeliverAreaCustomer> customerAreaList = newsService.getCustomerArea(stationID,page);
    	Map<String,Object> resultMap = new HashMap<String, Object>();
    	resultMap.put("size", customerAreaList.size());
    	resultMap.put("data", customerAreaList);
    	return resultMap;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
