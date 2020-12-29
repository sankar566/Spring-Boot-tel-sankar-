package com.Tel.sankar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("This is main method ");
//		Alien a = context.getBean(Alien.class);
//		a.show();
//		
//		Alien a1 = context.getBean(Alien.class);
//		a1.show();
	}

}
