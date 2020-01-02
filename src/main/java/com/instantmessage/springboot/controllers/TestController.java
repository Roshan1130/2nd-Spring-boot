package com.instantmessage.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.instantmessage.springboot.dtos.NotificationDto;
import com.instantmessage.springboot.dtos.StudentDto;
import com.instantmessage.springboot.services.NotificationService;

@RestController
@RequestMapping("/test")
public class TestController {
	
	/*
	 * @Autowired private StudentService ss;
	 */
	@Autowired
	private NotificationService ns;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String testUser(@RequestParam Integer a) {
		
		
		return "1st test";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void setValue(@RequestBody StudentDto student) {
		System.out.println(student.toString());
	}	
	

	@RequestMapping(value="/message", method=RequestMethod.POST)
	public void setValue(@RequestBody NotificationDto not) {
		ns.notifyMe(not);
	}


	
}
   