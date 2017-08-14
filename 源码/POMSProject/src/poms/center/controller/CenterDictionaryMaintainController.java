package poms.center.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.DeliverArea;
import poms.center.entity.Department;
import poms.center.entity.Duty;
import poms.center.entity.NewsOffice;
import poms.center.entity.TransferCom;
import poms.center.entity.UserModify;
import poms.center.service.ICenterDictionaryMaintainService;

@Controller
@RequestMapping("/center/dictionaryMaintain")
@SessionAttributes({"stationID","departmentID","operator"})
public class CenterDictionaryMaintainController {

	@Autowired
	private ICenterDictionaryMaintainService centerDictionaryMaintainService;

	
	@RequestMapping(value="/insertDepartment",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertDepartment(Department department){
		int result = centerDictionaryMaintainService.insertDepartment(department);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateDepartment",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateDepartment(Department department){
		int result = centerDictionaryMaintainService.updateDepartment(department);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	
	@RequestMapping(value="/deleteDepartment",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteDepartment(@RequestParam("departmentID") int departmentID){
		int result = centerDictionaryMaintainService.deleteDepartment(departmentID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	
	@RequestMapping(value="/departmentList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> departmentList(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Department> departmentList = centerDictionaryMaintainService.selectDepartmentList(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", departmentList.size());
		resultMap.put("data", departmentList);
		return resultMap;
	}
	
	@RequestMapping(value="/departmentByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> departmentByID(@RequestParam("departmentID") int departmentID,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Department> departmentList = centerDictionaryMaintainService.selectDepartmentByID(stationID, departmentID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", departmentList.size());
		resultMap.put("data", departmentList);
		return resultMap;
	}
	
	@RequestMapping(value="/departmentListByName",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> departmentListByName(@RequestParam("departmentName") String departmentName,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<Department> departmentList = centerDictionaryMaintainService.selectDepartmentListByName(stationID,departmentName);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", departmentList.size());
		resultMap.put("data", departmentList);
		return resultMap;
	}
	
	@RequestMapping(value="/insertDuty",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertDuty(Duty duty){
		int result = centerDictionaryMaintainService.insertDuty(duty);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateDuty",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateDuty(Duty duty){
		int result = centerDictionaryMaintainService.updateDuty(duty);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteDuty",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteDuty(@RequestParam("dutyType") int dutyType){
		int result = centerDictionaryMaintainService.deleteDuty(dutyType);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/dutyList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> dutyList(){
		List<Duty> dutyList = centerDictionaryMaintainService.selectDutyList();
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size",dutyList.size());
		resultMap.put("data", dutyList);
		return resultMap;
	}
	
	@RequestMapping(value="/dutyByType",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> dutyByType(@RequestParam("dutyType") int dutyType){
		List<Duty> dutyList = centerDictionaryMaintainService.selectDutyByType(dutyType);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", dutyList.size());
		resultMap.put("data", dutyList);
		return resultMap;
	}
	
	@RequestMapping(value="/dutyListByName",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> dutyListByName(@RequestParam("dutyName") String dutyName){
		List<Duty> dutyList = centerDictionaryMaintainService.selectDutyByName(dutyName);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size",dutyList.size());
		resultMap.put("data", dutyList);
		return resultMap;
	}
	
	@RequestMapping(value="/insertTransferCom",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertTransferCom(TransferCom transferCom){
		int result = centerDictionaryMaintainService.insertTransferCom(transferCom);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateTransferCom",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateTransferCom(TransferCom transferCom){
		int result = centerDictionaryMaintainService.updateTransferCom(transferCom);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteTransferCom",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteTransferCom(@RequestParam("transferComID") int transferComID){
		int result = centerDictionaryMaintainService.deleteTransferCom(transferComID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/transferComList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> transferComList(){
		List<TransferCom> transferComList = centerDictionaryMaintainService.selectTransferComList();
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", transferComList.size());
		resultMap.put("data", transferComList);
		return resultMap;
	}
	
	@RequestMapping(value="/transferComByName",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> transferComByName(@RequestParam("transferComName") String transferComName){
		List<TransferCom> transferComList = centerDictionaryMaintainService.selectTransferComByName(transferComName);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", transferComList.size());
		resultMap.put("data", transferComList);
		return resultMap;
	}
	
	@RequestMapping(value="/insertDeliverArea",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertDeliverArea(DeliverArea deliverArea){
		int result = centerDictionaryMaintainService.insertDeliverArea(deliverArea);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateDeliverArea",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateDeliverArea(DeliverArea deliverArea){
		int result = centerDictionaryMaintainService.updateDeliverArea(deliverArea);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteDeliverArea",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteDeliverArea(@RequestParam("deliverAreaID") int deliverAreaID){
		int result = centerDictionaryMaintainService.deleteDeliverArea(deliverAreaID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deliverAreaList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deliverAreaList(ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<DeliverArea> deliverAreaList = centerDictionaryMaintainService.selectDeliverAreaList(stationID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", deliverAreaList.size());
		resultMap.put("data", deliverAreaList);
		return resultMap;
	}
	
	@RequestMapping(value="/deliverAreaByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deliverAreaByID(@RequestParam("deliverAreaID") int deliverAreaID,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<DeliverArea> deliverAreaList = centerDictionaryMaintainService.selectDeliverAreaByID(stationID, deliverAreaID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", deliverAreaList.size());
		resultMap.put("data", deliverAreaList);
		return resultMap;
	}
	
	
	@RequestMapping(value="/deliverAreaListByName",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deliverAreaListByName(@RequestParam("deliverAreaName") String deliverAreaName,ModelMap map){
		int stationID = (Integer)map.get("stationID");
		List<DeliverArea> deliverAreaList = centerDictionaryMaintainService.selecctDeliverAreaListByName(stationID, deliverAreaName);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", deliverAreaList.size());
		resultMap.put("data", deliverAreaList);
		return resultMap;
	}
	
	@RequestMapping(value="/insertUserModify",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertUserModify(UserModify userModify){
		int result = centerDictionaryMaintainService.insertUserModify(userModify);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateUserModify",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> updateUserModify(UserModify userModify){
		int result = centerDictionaryMaintainService.updateUserModify(userModify);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteUserModify",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteUserModify(@RequestParam("recordID") int recordID){
		int result = centerDictionaryMaintainService.deleteUserModify(recordID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/userModifyList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> userModifyList(){
		List<UserModify> userModifyList = centerDictionaryMaintainService.selectUserModifyList();
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", userModifyList.size());
		resultMap.put("data", userModifyList);
		return resultMap;
	}
	
	@RequestMapping(value="/userModifyListByType",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> userModifyListByType(@RequestParam("type") int type){
		List<UserModify> userModifyList = centerDictionaryMaintainService.selectUserModifyByType(type);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", userModifyList.size());
		resultMap.put("data", userModifyList);
		return resultMap;
	}

	
	@RequestMapping(value="/insertNewsOffice",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertNewsOffice(NewsOffice newsOffice){
		int result = centerDictionaryMaintainService.insertNewsOffice(newsOffice);
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateNewsOffice",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateNewsOffice(NewsOffice newsOffice){
		int result = centerDictionaryMaintainService.updateNewsOffice(newsOffice);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteNewsOffice",method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteNewsOffice(@RequestParam("noID") int newsOfficeID){
		int result = centerDictionaryMaintainService.deleteNewsOffice(newsOfficeID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/newsOfficeList",method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> newsOfficeList(){
		List<NewsOffice> newsOfficeList = centerDictionaryMaintainService.selectNewsOfficeList();
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", newsOfficeList.size());
		resultMap.put("data", newsOfficeList);
		return resultMap;
	}
	
	@RequestMapping(value="/newsOfficeByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> newsOfficeByID(@RequestParam("noID") int noID){
		List<NewsOffice> newsOfficeList = centerDictionaryMaintainService.selectNewsOfficeByID(noID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", newsOfficeList.size());
		resultMap.put("data", newsOfficeList);
		return resultMap;
	}
	
	@RequestMapping(value="/newsOfficeListByName",method= RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> newsOfficeListByName(@RequestParam("noName") String noName){
		List<NewsOffice> newsOfficeList = centerDictionaryMaintainService.selectNewsOfficeByName(noName);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", newsOfficeList.size());
		resultMap.put("data", newsOfficeList);
		return resultMap;
	}
	
	@RequestMapping(value="/form2")
	public String form2(){
		return "form2";
	}
}
