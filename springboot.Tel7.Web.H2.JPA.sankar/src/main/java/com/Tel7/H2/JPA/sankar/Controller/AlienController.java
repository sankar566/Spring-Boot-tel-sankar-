package com.Tel7.H2.JPA.sankar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Tel7.H2.JPA.sankar.Model.Alien;
import com.Tel7.H2.JPA.sankar.dao.AlienRepo;

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
	@RequestMapping("/getAlien")
	public ModelAndView addAlien(@RequestParam int aid) {
      ModelAndView mv = new ModelAndView("showAlien.jsp");
	 // Alien alien = repo.findById(aid).orElse(null);
    Alien alien = repo.findById(aid).orElse(new Alien());
	  mv.addObject(alien);
	  System.out.println("find by id method call ");
	  
		return mv;
	}
	
	@RequestMapping("/getAlien1")
	public ModelAndView addAlien1(@RequestParam int aid) {
      ModelAndView mv = new ModelAndView("showAlien.jsp");
	 // Alien alien = repo.findById(aid).orElse(null);
	  Alien alien = repo.findById(aid).orElse(new Alien());
	  mv.addObject(alien);
	  System.out.println(repo.findByTech("java"));
	  System.out.println(repo.findByAidGreaterThan(102));
	  System.out.println(repo.findByTechSorted("java"));
	  return mv;
	}
	
	

}
