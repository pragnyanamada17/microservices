package com.cap.anurag.service;

import java.util.Optional;

import com.cap.anurag.entity.EmployeeDetails;

public interface EmployeeServiceI {

	Optional<EmployeeDetails> getEmployeeDetails(Integer empId);

}
