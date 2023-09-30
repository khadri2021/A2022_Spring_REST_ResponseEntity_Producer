package com.khadri.spring.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khadri.spring.rest.entity.Student;

@RestController
public class ProducerRestController {
	
	@GetMapping("/get/student")
	public Student getStudent() {
		Student student = new Student();
		student.setId(100);
		student.setName("JHON");
		student.setAddress("KADIRI");
		return student;
	}
}
