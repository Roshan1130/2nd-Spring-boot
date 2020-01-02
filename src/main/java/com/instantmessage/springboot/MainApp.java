package com.instantmessage.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.instantmessage.springboot.MainApp;

//@ComponentScan(basePackages = {"com.instantmessage.springboot.controllers", "com.instantmessage.springboot.services"})
@ComponentScan
@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		System.out.println("Inside the main application to show program run");
		SpringApplication.run(MainApp.class, args);
	}

}
