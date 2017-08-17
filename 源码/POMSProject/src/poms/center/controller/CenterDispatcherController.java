package poms.center.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CenterDispatcherController {

	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpServletRequest request){
		request.getSession().invalidate();
		return "redirect:login";
	}
	
	
	@RequestMapping(value={"/centerStation/**","/publish/**","/finance/**","/deliver/**","/support/**"})
	public void dispatch(){
		
	}
	
}
