package com.cap.anurag.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.anurag.dao.EmployeeRepository;
import com.cap.anurag.entity.EmployeeDetails;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository dao;
	
public List<EmployeeDetails> fetchAllEmployees() {
		return  dao.findAll();

	}
}
