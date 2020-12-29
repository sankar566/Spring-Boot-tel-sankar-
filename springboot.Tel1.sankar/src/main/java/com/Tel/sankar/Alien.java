package com.Tel.sankar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Alien {
	private int aid;
	private String aname;
	private String tech;
	
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	public void show() {
		System.out.println("alien class show method");
	}
	public Alien() {
		super();
		System.out.println("THIS IS ALIEN constructor ,   ");
		
	    System.out.println("object created during the applicatin start---->if we are create any object, that object is not consider .");
	    System.out.println("and springboot singledon design pattern object creat in default");
	    System.out.println("anotation @scope is used to cahnge singleton to  prototype object create.no default object create.. we any number of different create object");
	
	
	}
	
	
	

}
