package com.Tel5.MVC.Sankar.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Tel5.MVC.Sankar.Alien.Alien;

@Controller
public class homeController {
	@RequestMapping("/home")
public String home(@RequestParam("dog")String Myname,HttpSession session )
{
	System.out.println("hai" + Myname);
	session.setAttribute("name",Myname);
	return "home.jsp";
}
	@RequestMapping("/assign")
	
	public ModelAndView home1(@RequestParam("cow")String Myname)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",Myname);
		mv.setViewName("home.jsp");
		System.out.println("hai" + Myname);
		return mv;
	}

	 @RequestMapping("home11")
		public ModelAndView home11(Alien alien) {
	    ModelAndView mv = new ModelAndView();
	    mv.addObject("keyobject", alien);
	    mv.setViewName("home.jsp");
		return mv;
	}
	
	
}
