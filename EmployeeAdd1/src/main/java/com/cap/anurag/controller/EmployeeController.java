package com.cap.anurag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.anurag.entity.EmployeeDetails;
import com.cap.anurag.service.EmployeeServiceI;

@RestController
@RequestMapping("/Create_Employee")
@CrossOrigin("http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeServiceI service;
	
	@SuppressWarnings("unused")
	@PostMapping("/create")
	public ResponseEntity<String> createEmployee(@RequestBody EmployeeDetails employee){
		
		EmployeeDetails emp = service.createEmployee(employee);
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("Employee created successfully",HttpStatus.OK);
		return responseEntity;
		
	}}
