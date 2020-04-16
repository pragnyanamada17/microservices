package com.cap.anurag.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.anurag.dao.EmployeeRepository;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI{

	@Autowired
	private EmployeeRepository dao;

	public String deleteEmployee(Integer empId)   {
		dao.deleteById(empId);
		return "Deleted Successfully";
	}


}
