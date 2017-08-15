package poms.deliver.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.DeliverPoint;
import poms.center.entity.PrintDeliver;
import poms.center.entity.Printer;
import poms.deliver.service.IDeliverPointService;
import poms.deliver.service.IPrintDeliverService;
import poms.deliver.service.IPrinterService;

@Controller
@RequestMapping("/deliver/systemManage")
@SessionAttributes({"stationID","departmentID","operator"})
public class SystemManageController {
	@Resource
	private IPrinterService printerService;
	@Resource
	private IDeliverPointService deliverPointService;
	@Resource
	private IPrintDeliverService printDeliverService;

	@RequestMapping("/addPrinter")
	@ResponseBody
	public Map<String, Object> addPrinter(Printer printer, ModelMap modelMap) {
		int stationID = (int) modelMap.get("stationID");
		printer.setStationID(stationID);
		int state = this.printerService.insertPrinter(printer);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if (state != 1) {
			map.put("error", "印刷点信息添加失败,请重试");
		}
		return map;
	}

	@RequestMapping("/updatePrinter")
	@ResponseBody
	public Map<String, Object> updatePrinter(Printer printer, ModelMap modelMap) {
		int state = this.printerService.updatePrinter(printer);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if (state != 1) {
			map.put("error", "印刷点信息更新失败,请重试");
		}
		return map;
	}

	@RequestMapping("/queryAllPrinter")
	@ResponseBody
	public Map<String, Object> allPrinterList(@RequestParam("page") int page,ModelMap modelMap) {
		int stationID = (int) modelMap.get("stationID");
		List<Printer> list = this.printerService.queryAllPrinter(stationID,page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", list.size());
		map.put("data", list);
		return map;
	}

	@RequestMapping("/queryPrinter")
	@ResponseBody
	public Map<String, Object> queryPrinterByID(@RequestParam("printerID") int printerID) {
		List<Printer> list = this.printerService.selectPrinterByID(printerID);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", list.size());
		map.put("data", list);
		return map;
	}

	@RequestMapping("/deletePrinter")
	@ResponseBody
	public Map<String, Object> deletePrinterByID(@RequestParam("printerID") int printerID) {
		int state = this.printerService.deletePrinterByID(printerID);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if (state != 1) {
			map.put("error", "印刷点信息删除失败,请重试");
		}
		return map;
	}

	@RequestMapping("/addDeliverPoint")
	@ResponseBody
	public Map<String, Object> addDeliverPoint(DeliverPoint deliverPoint,ModelMap modelMap) {
		int stationID=(int)modelMap.get("stationID");
		deliverPoint.setStationID(stationID);
		int state = this.deliverPointService.insertDeliverPoint(deliverPoint);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if (state != 1) {
			map.put("error", "送报点信息添加失败,请重试");
		}
		return map;
	}
	
	@RequestMapping("/updateDeliverPoint")
	@ResponseBody
	public Map<String, Object> updateDeliverPoint(DeliverPoint deliverPoint, ModelMap modelMap) {
		int state = this.deliverPointService.updateDeliverPoint(deliverPoint);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if (state != 1) {
			map.put("error", "送报点信息更新失败,请重试");
		}
		return map;
	}
	
	@RequestMapping("/queryAllDeliverPoint")
	@ResponseBody
	public Map<String, Object> allDeliverPointList(@RequestParam("page") int page,ModelMap modelMap) {
		int stationID = (int) modelMap.get("stationID");
		List<DeliverPoint> list = this.deliverPointService.queryAllDeliverPoint(stationID,page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", list.size());
		map.put("data", list);
		return map;
	}

	@RequestMapping("/queryDeliverPoint")
	@ResponseBody
	public Map<String, Object> queryDeliverPointByID(@RequestParam("page") int page,@RequestParam("deliverPointID") int deliverPointID) {
		List<DeliverPoint> list = this.deliverPointService.selectDeliverPointByID(deliverPointID,page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", 1);
		map.put("data", list);
		return map;
	}

	@RequestMapping("/deleteDeliverPoint")
	@ResponseBody
	public Map<String, Object> deleteDeliverPointByID(@RequestParam("deliverPointID") int deliverPointID) {
		int state = this.deliverPointService.deleteDeliverPointByID(deliverPointID);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if (state != 1) {
			map.put("error", "送报点信息删除失败,请重试");
		}
		return map;
	}
	
	@RequestMapping("/addPrintDeliver")
	@ResponseBody
	public Map<String, Object> addPrintDeliver(PrintDeliver printDeliver) {
		int state = this.printDeliverService.insertPrintDeliver(printDeliver);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if (state != 1) {
			map.put("error", "印刷点送报点对应信息添加失败,请重试");
		}
		return map;
	}
	
	@RequestMapping("/updatePrintDeliver")
	@ResponseBody
	public Map<String, Object> updatePrintDeliver(PrintDeliver printDeliver) {
		int state = this.printDeliverService.updatePrintDeliver(printDeliver);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if (state != 1) {
			map.put("error", "印刷点送报点对应信息更新失败,请重试");
		}
		return map;
	}
	
	@RequestMapping("/queryAllPrintDeliver")
	@ResponseBody
	public Map<String, Object> allPrintDeliverList(@RequestParam("page") int page,ModelMap modelMap) {
		int stationID =(int) modelMap.get("stationID");
		List<PrintDeliver> list = this.printDeliverService.queryAllPrintDeliver(stationID,page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", list.size());
		map.put("data", list);
		return map;
	}

	@RequestMapping("/queryPrintDeliver")
	@ResponseBody
	public Map<String, Object> queryPrintDeliverByID(@RequestParam("printID") int printID) {
		List<PrintDeliver> list = this.printDeliverService.selectPrintDeliverByID(printID);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", 1);
		map.put("data", list);
		return map;
	}

	@RequestMapping("/deletePrintDeliver")
	@ResponseBody
	public Map<String, Object> deletePrintDeliverByID(@RequestParam("printID") int printID,@RequestParam("deliverPointID") int deliverPointID) {
		int state = this.printDeliverService.deletePrintDeliverByID(printID,deliverPointID);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", state);
		if (state != 1) {
			map.put("error", "印刷点送报点对应信息删除失败,请重试");
		}
		return map;
	}
}
