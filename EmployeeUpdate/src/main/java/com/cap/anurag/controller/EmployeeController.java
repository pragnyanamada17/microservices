package com.cap.anurag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cap.anurag.entity.EmployeeDetails;
import com.cap.anurag.service.EmployeeServiceI;

public class EmployeeController {
	@RestController
	@RequestMapping("/Update_employee")
	@CrossOrigin("http://localhost:4200")
	public class Controller {

		@Autowired
		private EmployeeServiceI service;
		
		
		
		@PutMapping("/update")
		public ResponseEntity<String> updateEmployee(@RequestBody EmployeeDetails employee)  {
			
			String Url="http://localhost:1411/GetEmployee/findById/"+employee.getEmployeeID();
			 RestTemplate restTemplate = new RestTemplate();
		     EmployeeDetails result = restTemplate.getForObject(Url, EmployeeDetails.class);
			ResponseEntity< String> details = new ResponseEntity<String>(service.updateEmployee(employee),HttpStatus.OK);
				return details;
			}
			
		}
		
		
	}

