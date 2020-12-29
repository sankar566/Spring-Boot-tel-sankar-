package com.Tel10.H2.REST.JPA.sankar.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Tel10.H2.REST.JPA.sankar.Model.Alien;
import com.Tel10.H2.REST.JPA.sankar.dao.AlienRepo;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	// any  format data send  
//	@PostMapping("/alien")
//	public Alien addAlien(@RequestBody Alien alien) {
//		repo.save(alien); 
//		return alien;
//	}
	// json format data only send 
@PostMapping(path="/alien",consumes= {"application/json"})
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien); 
		return alien;
	}
	
	@GetMapping(path="/alien")
		public List<Alien> getAliens() {
		return repo.findAll(); 
	}
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		Alien a = repo.getOne(aid);
		repo.delete(a);
		
		return "This data deleted";
	}
	@PutMapping("/alien")
	public Alien SaveOrUpdate(@RequestBody Alien alien) {
	repo.save(alien);
	return alien;
	}
	
	@RequestMapping("/alien/{aid}")
		public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid); 
	}
	
	

}
