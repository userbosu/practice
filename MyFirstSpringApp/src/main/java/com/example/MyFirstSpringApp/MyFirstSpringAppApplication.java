package com.example.MyFirstSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class MyFirstSpringAppApplication {

	private static final Logger logger = LoggerFactory.getLogger(MyFirstSpringAppApplication.class);
	
	public static void main(String[] args) {
		logger.info("Application started!");
		SpringApplication.run(MyFirstSpringAppApplication.class, args);
		logger.info("Application end!");
	}

}
