package poms.deliver.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.constants.CommonConstants;
import poms.center.entity.Advice;
import poms.deliver.service.IDeliverAdviceService;

@Controller
@RequestMapping("/deliver/advice")
@SessionAttributes({"stationID","departmentID","operator"})
public class DeliverAdviceController {

	@Resource
	private IDeliverAdviceService deliverAdviceService;

	@RequestMapping(value = "/adviceUnReaded", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getAdviceUnReaded(@RequestParam("page") int page,ModelMap modelMap) {
		int receiveStationID = (int) modelMap.get("stationID");
		int receiveDeptID = (int)modelMap.get("departmentID");
		List<Advice> list = this.deliverAdviceService.selectAdviceList(receiveStationID,receiveDeptID,CommonConstants.UNREADED,page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", list.size());
		map.put("data", list);
		return map;
	}

	@RequestMapping(value = "/sendAdvice", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> sendAdvice(Advice advice, ModelMap modelMap) {
		int stationID=(int) modelMap.get("stationID");
		int deptID=(int) modelMap.get("departmentID");
		advice.setSendStationID(stationID);
		advice.setSendDeptID(deptID);
		advice.setSendDate(new Date());
		int state =this.deliverAdviceService.insertAdvice(advice);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if(state!=1){
			map.put("error", "通知发送失败");
		}
		return map;
	}

	@RequestMapping(value = "/readedAdvice", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getAdviceReaded(@RequestParam("page")int page,ModelMap modelMap) {
		int receiveStationID=(int) modelMap.get("stationID");
		int receiveDeptID = (int)modelMap.get("departmentID");
		List<Advice> list = this.deliverAdviceService.selectAdviceList(receiveStationID,receiveDeptID,CommonConstants.READED,page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", list.size());
		map.put("data", list);
		return map;
	}
}
