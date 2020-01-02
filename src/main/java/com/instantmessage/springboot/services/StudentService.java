package com.instantmessage.springboot.services;

import com.instantmessage.springboot.dtos.StudentDto;

public class StudentService {
	public void display(StudentDto student) {
		System.out.println(student.toString());
	}
}
