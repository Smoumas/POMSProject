package poms.center.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import poms.center.entity.Operator;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		// TODO Auto-generated method stub
		String url = request.getRequestURI();
		String system = getSystem(url);

//		if (system.equals("login")) {
//			return true;
//		}
		if(url.indexOf("login") >= 0 || url.indexOf("logout") >= 0){
			return true;
		}
		
		HttpSession httpSession = request.getSession();
		Operator operator = (Operator) httpSession.getAttribute("operator");
		if (operator != null) {
			int level = operator.getLevel();
			if (level == 1) {
				if (system.equals("center") || system.equals("centerStation")) {
					return true;
				}
			} else if (level == 2) {
				if (system.equals("publish")) {
					return true;
				}
			} else if (level == 3) {
				if (system.equals("deliver")) {
					return true;
				}
			} else if (level == 4) {
				if (system.equals("finance")) {
					return true;
				}
			} else if (level == 5) {
				if (system.equals("support") ) {
					return true;
				}
			}
		}
		response.sendRedirect("/POMSProject/login");
		return false;
	}

	public String getSystem(String url) {
		String subUri = url.substring(13);
		int index = subUri.indexOf("/");
		if (index != -1) {
			String system = subUri.substring(0, index);
			if (system.equals("login")) {
				return "returnLogin";
			} else {
				return system;
			}
		} else {
			return subUri;
		}
	}

}
