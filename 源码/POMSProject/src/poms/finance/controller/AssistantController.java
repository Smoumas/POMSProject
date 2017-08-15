package poms.finance.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sakamichi on 2017/8/7.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.Advice;
import poms.finance.service.AssistantService;



@Controller
@RequestMapping("/assist")
@SessionAttributes("stationID")
public class AssistantController {
    @Autowired
    private AssistantService assistantService;

    @RequestMapping(value="/unreadedAdvice",method=RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getUnreadedAdvice(@RequestParam("page") int page,ModelMap map){
    	int stationID = (Integer)map.get("stationID");
    	int departmentID = (Integer)map.get("departmentID");
        List<Advice> unreadedAdviceList = assistantService.getUnreadedAdvice(stationID,departmentID,page);
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("size", unreadedAdviceList.size());
        modelMap.put("data", unreadedAdviceList);
        return modelMap;
    }

    @RequestMapping(value="/sendAdvice",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> sendService(Advice advice,ModelMap map){
//		System.out.println(map.get("stationID"));
        int result=assistantService.sendAdvice(advice);
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("result", result);
        return modelMap;
    }

    @RequestMapping(value="/readedAdvice",method=RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getReadedAdvice(@RequestParam("page") int page,ModelMap map){
    	int stationID = (Integer)map.get("stationID");
    	int departmentID = (Integer)map.get("departmentID");
        List<Advice> readedAdviceList = assistantService.getReadedAdvice(stationID,departmentID,page);
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("size", readedAdviceList.size());
        modelMap.put("data", readedAdviceList);
        return modelMap;
    }

    @RequestMapping(value="/changePassword",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> changePassword(@RequestParam("operatorID")int operatorID,@RequestParam("newPasword")String newPassword,ModelMap map){
        int result = assistantService.changePassword(operatorID,newPassword);
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("result", result);
        return modelMap;
    }

}
