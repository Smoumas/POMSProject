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
@RequestMapping("/finance/maintain")
@SessionAttributes({"stationID","departmentID","operator"})
public class MaintainController {

    @RequestMapping(value="/updateTransportRules",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> updateTransportRules(ModelMap map){
        Map<String,Object> modelMap = new HashMap<>();

        return modelMap;
    }
}
