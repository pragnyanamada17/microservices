package com.cap.anurag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.anurag.entity.EmployeeDetails;
import com.cap.anurag.service.EmployeeServiceI;

public class EmployeeController {
	@RestController
	@RequestMapping("/FetchAll_employees")
	@CrossOrigin("http://localhost:4200")
	public class Controller {

		@Autowired
		private EmployeeServiceI service;
		
		
		
		
		
		@GetMapping("/fetchall")
		public List<EmployeeDetails> fetchAllEmployees() {
			return service.fetchAllEmployees();
		}
		
		
	}}
