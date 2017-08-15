package poms.center.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import poms.center.entity.Newspaper;
import poms.center.entity.NewspaperPrice;
import poms.center.service.ICenterNewspaperService;

@Controller
@RequestMapping("/center/newspaper")
@SessionAttributes({"stationID","departmentID","operator"})
public class CenterNewspaperController {

	@Autowired
	private ICenterNewspaperService centerNewspaperService;
	
	@RequestMapping(value="/insertNewspaper",method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertNewspaper(Newspaper newspaper){
		int result = centerNewspaperService.insertNewspaper(newspaper);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateNewspaper",method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateNewspaper(Newspaper newspaper){
		int result = centerNewspaperService.updateNewspaper(newspaper);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteNewspaper",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteNewspaper(@RequestParam("newspaperID") int newspaperID){
		int result = centerNewspaperService.deleteNewspaper(newspaperID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/newspaperList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> newspaperList(@RequestParam("page") int page){
		List<Newspaper> newspaperList = centerNewspaperService.selectNewspaperList(page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", newspaperList.size());
		resultMap.put("data", newspaperList);
		return resultMap;
	}
	
	@RequestMapping(value="/newspaperByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> newspaperByID(@RequestParam("page") int page,@RequestParam("newspaperID") int newspaperID){
		List<Newspaper> newspaperList = centerNewspaperService.selectNewspaperByID(newspaperID,page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", newspaperList.size());
		resultMap.put("data", newspaperList);
		return resultMap;
	}
	
	@RequestMapping(value="/newspaperListByName",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> newspaperListByName(@RequestParam("page") int page,@RequestParam("newspaperName")String newspaperName){
		List<Newspaper> newspaperList = centerNewspaperService.selectNewspaperListByName(newspaperName,page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", newspaperList.size());
		resultMap.put("data", newspaperList);
		return resultMap;
	}
	
	@RequestMapping(value="/newspaperListByNO",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> newspaperListByNO(@RequestParam("page") int page,@RequestParam("noID") int noID){
		List<Newspaper> newspaperList = centerNewspaperService.selectNewspaperByNO(noID,page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", newspaperList.size());
		resultMap.put("data", newspaperList);
		return resultMap;
	}
	
	@RequestMapping(value="/insertNewspaperPrice",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> insertNewspaperPrice(NewspaperPrice newspaperPrice){
		int result = centerNewspaperService.insertNewspaperPrice(newspaperPrice);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/updateNewspaperPrice",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> updateNewspaperPrice(NewspaperPrice newspaperPrice){
		int result = centerNewspaperService.updateNewspaperPrice(newspaperPrice);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/deleteNewspaperPrice",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> deleteNewspaperPrice(@RequestParam("newspaperID") int newspaperID){
		int result = centerNewspaperService.deleteNewspaperPrice(newspaperID);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}
	
	@RequestMapping(value="/newspaperPriceList",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> newspaperPriceList(@RequestParam("page") int page){
		List<NewspaperPrice> newspaperPriceList = centerNewspaperService.selectNewspaperPriceList(page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", newspaperPriceList.size());
		resultMap.put("data", newspaperPriceList);
		return resultMap;
	}
	
	@RequestMapping(value="/newspaperPriceByID",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> newspaperPriceByID(@RequestParam("page") int page,@RequestParam("newspaperID") int newspaperID){
		List<NewspaperPrice> newspaperPriceList = centerNewspaperService.selectNewspaperPriceByID(newspaperID,page);
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("size", newspaperPriceList.size());
		resultMap.put("data",newspaperPriceList);
		return resultMap;
	}
}
