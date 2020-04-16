package com.cap.anurag.service;

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
	

	public String updateEmployee(EmployeeDetails employee) {
		boolean result=dao.existsById(employee.getEmployeeID());
		if(result)
		{
			dao.save(employee);
			return "Updated Successfully";
		}else
		{
			dao.save(employee);
			return "Update not possible user added ";
		}
	}}