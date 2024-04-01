package com.test.Test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Test.model.Employee;
import com.test.Test.repository.EmployeeRepository;

@Service
public class EmployeeSevice {

@Autowired
private EmployeeRepository employeeRepository ;

public Employee insertEmployee(Employee emp) {
	return employeeRepository.save(emp);
	
}
}
