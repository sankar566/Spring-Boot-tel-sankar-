package com.Tel8.H2.REST.JPA.sankar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Tel8.H2.REST.JPA.sankar.Model.Alien;
import com.Tel8.H2.REST.JPA.sankar.dao.AlienRepo;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien); 
		return "home.jsp";
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
	public String getAliens() {
		return repo.findAll().toString(); 
	}
	@RequestMapping("/alien")
	@ResponseBody
	public String getAlien() {
		return repo.findById(105).toString(); 
	}
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public String getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid).toString(); 
	}
	
	
	
	

}
