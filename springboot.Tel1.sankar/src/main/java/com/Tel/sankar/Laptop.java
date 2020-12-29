package com.Tel.sankar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	private int lid;
	private String brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	public Laptop() {
		super();
		System.out.println("THIS IS LAPTOPCLASS CONSTRUCTOR ");
		System.out.println("when ever the application is run during that time one singleton object is crete in spring container in the same name of class name.  ");
	    System.out.println("object create in same as class name.");
	    System.out.println("@Component(\"lap1\")---object create in this name--lap1");
	    System.out.println("autowired, qualifier(lap1)..access laptop object to other class in the name---lap1");
	    
	
	
	}
	
	

}
