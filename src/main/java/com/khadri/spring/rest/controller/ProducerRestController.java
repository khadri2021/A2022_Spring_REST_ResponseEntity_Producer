package com.khadri.spring.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khadri.spring.rest.entity.Student;

@RestController
public class ProducerRestController {

	@GetMapping("/get/student")
	public ResponseEntity<Student> getStudent() {

		return ResponseEntity.status(HttpStatus.CREATED)
				.body(Student.builder().withId(100).withName("JHON").withAddress("KADIRI").build());
	}
}
