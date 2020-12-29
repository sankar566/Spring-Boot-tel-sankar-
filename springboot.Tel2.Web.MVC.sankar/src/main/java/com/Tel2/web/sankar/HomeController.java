package com.Tel2.web.sankar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
//		jsp file is placed webapp folder inside and this webapp folder is placed inside of pages folder -- application properties
	    @RequestMapping("home3")
		public String home3() {
		System.out.println("This is home3 method ");
		return "Home";
	}

}
