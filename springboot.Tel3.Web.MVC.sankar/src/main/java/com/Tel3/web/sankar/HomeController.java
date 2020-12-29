package com.Tel3.web.sankar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public void home() {
		System.out.println("This is home method ");
	}
	
	@RequestMapping("home1")
	@ResponseBody
	public String home1() {
		System.out.println("This is home1 method ");
		return "Home.jsp";
	}
//	jsp file is placed webapp folder inside 
	    @RequestMapping("home2")
		public String home2() {
		System.out.println("This is home2 method ");
		return "Home.jsp";
	}
	    // jsp page open and output will produce in console 
	    @RequestMapping("home4")
		public String home4(HttpServletRequest req) {
	    String name = req.getParameter("dog");
		System.out.println("This is home4 method ");
		System.out.println("hai" +name);
		return "Home.jsp";
	}
	    @RequestMapping("home5")
		public String home5(HttpServletRequest req) {
	    HttpSession session = req.getSession();
	    String name = req.getParameter("dog");
	    session.setAttribute("keyname", name);
		System.out.println("This is home 5 method ");
		System.out.println("hai" +name);
		return "Home.jsp";
	}
	    @RequestMapping("home6")
		public String home6(HttpServletRequest req,HttpServletResponse res) {
	    HttpSession session = req.getSession();
	    String name = req.getParameter("dog");
	    session.setAttribute("keyname6", name);
		System.out.println("This is home 6 method ");
		System.out.println("hai" +name);
		return "Home.jsp";
	}
	    @RequestMapping("home7")
		public String home7(String name7,HttpSession session) {
	    
	    session.setAttribute("keyname7", name7);
		System.out.println("This is home 7 method ");
		System.out.println("hai" +name7);
		return "Home.jsp";
	}
	    @RequestMapping("home8")
		public String home8(String myname,HttpSession session) {
	    
	    session.setAttribute("keyname8", myname);
		System.out.println("This is home 8 method ");
		System.out.println("hai" +myname);
		return "Home.jsp";
	}
	    @RequestMapping("home9")
		public String home9(@RequestParam("anyname") String myname9,HttpSession session) {
	    
	    session.setAttribute("keyname9", myname9);
		System.out.println("This is home 9 method ");
		System.out.println("hai" +myname9);
		return "Home.jsp";
	}
	    @RequestMapping("home10")
		public ModelAndView home10(@RequestParam("anyname") String myname10) {
	    ModelAndView mv = new ModelAndView();
	    mv.addObject("keyname10", myname10);
	    mv.setViewName("Home.jsp");
		return mv;
	}


}
