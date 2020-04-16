package com.cap.anurag.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.anurag.dao.EmployeeRepository;
import com.cap.anurag.entity.EmployeeDetails;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI{

	@Autowired
	private EmployeeRepository dao;
	@Override
	public EmployeeDetails createEmployee(EmployeeDetails employee)  {
		return dao.save(employee) ;	
	}
	
	

}