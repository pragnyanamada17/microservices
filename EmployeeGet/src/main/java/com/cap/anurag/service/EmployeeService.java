package com.cap.anurag.service;

import java.util.Optional;

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
	public Optional<EmployeeDetails> getEmployeeDetails(Integer empId)  {
		return dao.findById(empId);

	}

}
