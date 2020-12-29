package com.Tel9.H2.REST.JPA.sankar.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Tel9.H2.REST.JPA.sankar.Model.Alien;
import com.Tel9.H2.REST.JPA.sankar.dao.AlienRepo;

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
	 // this willproduce xml ans json format out put and we will get in any format output
	@RequestMapping("/aliens1")
	@ResponseBody
	public List<Alien> getAliens1() {
		return repo.findAll(); 
	}
	//This will produce only xml format output only. we will get xml format out put in postman
	@RequestMapping(path="/aliens",produces= {"application/xml"})
	@ResponseBody
	public List<Alien> getAliens() {
		return repo.findAll(); 
	}
	
	@RequestMapping("/alien")
	@ResponseBody
	public Optional<Alien> getAlien() {
		return repo.findById(105); 
	}
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid); 
	}
	
	

}
