package com.cap.anurag.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.anurag.entity.EmployeeDetails;
import com.cap.anurag.service.EmployeeService;
import com.cap.anurag.service.EmployeeServiceI;

@RestController
@RequestMapping("/GetEmployee")
@CrossOrigin("http://localhost:4200")
public class EmployeeController {
	@Autowired
	private EmployeeServiceI service;

	@GetMapping("/findById/{empId}")
	public Optional<EmployeeDetails> getEmployeeDetails(@PathVariable Integer empId) {
		Optional<EmployeeDetails> result=service.getEmployeeDetails(empId);
			return result;
		}
	

}
