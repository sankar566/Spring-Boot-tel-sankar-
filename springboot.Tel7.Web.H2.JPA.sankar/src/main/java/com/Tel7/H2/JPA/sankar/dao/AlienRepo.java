package com.Tel7.H2.JPA.sankar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Tel7.H2.JPA.sankar.Model.Alien;


public interface AlienRepo extends CrudRepository<Alien, Integer> {
   List<Alien>findByTech(String tech );
   List<Alien>findByAidGreaterThan(int aid);
   // write own querry---->  @querry. (aname sorted )
   @Query("from Alien where tech=?1 order by aname")
   List<Alien>findByTechSorted(String tech);
   
   	
}
