package poms.center.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CenterDispatcherController {

	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/centerStation/**")
	public void dispatch(){
		
	}
}
