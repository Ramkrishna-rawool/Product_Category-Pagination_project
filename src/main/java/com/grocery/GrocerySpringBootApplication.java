package com.grocery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.grocery")
public class GrocerySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrocerySpringBootApplication.class, args);
		System.out.println("APPLICATION WILL BE STARTED......");
	}

}
