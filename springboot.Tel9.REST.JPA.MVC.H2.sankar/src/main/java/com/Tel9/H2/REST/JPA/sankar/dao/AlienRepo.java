package com.Tel9.H2.REST.JPA.sankar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Tel9.H2.REST.JPA.sankar.Model.Alien;


public interface AlienRepo extends JpaRepository<Alien, Integer> {
   
   	
}
