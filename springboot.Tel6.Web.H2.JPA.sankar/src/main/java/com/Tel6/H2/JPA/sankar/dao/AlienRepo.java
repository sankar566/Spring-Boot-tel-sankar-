package com.Tel6.H2.JPA.sankar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Tel6.H2.JPA.sankar.Model.Alien;


public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
