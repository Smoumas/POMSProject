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
import org.springframework.web.bind.annotation.ResponseBody;

import poms.center.constants.CommonConstants;
import poms.center.entity.Advice;
import poms.deliver.service.IDeliverAdviceService;

@Controller
@RequestMapping("/deliver/advice")
public class DeliverAdviceController {

	@Resource
	private IDeliverAdviceService deliverAdviceService;

	@RequestMapping(value = "/adviceUnReaded", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getAdviceUnReaded(ModelMap modelMap) {
		int receiveStationID = (int) modelMap.get("stationID");
		int receiveDeptID = (int)modelMap.get("departmentID");
		List<Advice> list = this.deliverAdviceService.selectAdviceList(receiveStationID,receiveDeptID,CommonConstants.UNREADED);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", list.size());
		map.put("data", list);
		return map;
	}

	@RequestMapping(value = "/sendAdvice", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> sendAdvice(Advice advice, ModelMap modelMap) {
		// System.out.println(map.get("stationID"));
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
	public Map<String, Object> getAdviceReaded(ModelMap modelMap) {
		int receiveStationID=(int) modelMap.get("stationID");
		int receiveDeptID = (int)modelMap.get("departmentID");
		List<Advice> list = this.deliverAdviceService.selectAdviceList(receiveStationID,receiveDeptID,CommonConstants.READED);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", list.size());
		map.put("data", list);
		return map;
	}
}
