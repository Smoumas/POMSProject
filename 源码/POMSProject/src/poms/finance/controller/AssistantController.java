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
import org.springframework.web.servlet.ModelAndView;

import poms.center.entity.Advice;
import poms.center.entity.Operator;
import poms.finance.service.AssistantService;



@Controller
@RequestMapping("/assistant")
@SessionAttributes("stationID")
public class AssistantController {
    @Autowired
    private AssistantService assistantService;


    //测试登录
    @RequestMapping(value="/form",method= RequestMethod.GET)
    public ModelAndView index(ModelMap map){
        map.addAttribute("stationID", 123);
        return new ModelAndView("form","command",new Advice());//// TODO: 2017/8/7  
    }

    @RequestMapping(value="/unreadedAdvice",method=RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getUnreadedAdvice(ModelMap map){
    	int stationID = (Integer)map.get("stationID");
    	int departmentID = (Integer)map.get("departmentID");
        List<Advice> unreadedAdviceList = assistantService.getUnreadedAdvice(stationID,departmentID);
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
    public Map<String,Object> getReadedAdvice(ModelMap map){
    	int stationID = (Integer)map.get("stationID");
    	int departmentID = (Integer)map.get("departmentID");
        List<Advice> readedAdviceList = assistantService.getReadedAdvice(stationID,departmentID);
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("size", readedAdviceList.size());
        modelMap.put("data", readedAdviceList);
        return modelMap;
    }

    @RequestMapping(value="/changePassword",method=RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> changePassword(@RequestParam("newsPasword")String newPassword,ModelMap map){
    	int operatorID = ((Operator)map.get("operator")).getOperatorID();
        int result = assistantService.changePassword(operatorID,newPassword);
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("result", result);
        return modelMap;
    }

}
