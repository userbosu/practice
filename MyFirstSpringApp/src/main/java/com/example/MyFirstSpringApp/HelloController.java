package com.example.MyFirstSpringApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public String hello() {
    	logger.error("Inside hello b4 return");
        return "Hello, Spring Boot!";
    }
    @GetMapping("/error")
    public String error() {
    	logger.error("Inside error b4 return");
        return "error, Spring Boot!";
    }
    @GetMapping("/call")
    public String call() {
    	logger.error("Inside call b4 return");
        return "call, Spring Boot!";
    }
}