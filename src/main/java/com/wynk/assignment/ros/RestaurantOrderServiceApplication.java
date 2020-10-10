package com.wynk.assignment.ros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.wynk.assignment.ros"})
public class RestaurantOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantOrderServiceApplication.class, args);
	}

}
