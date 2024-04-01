package com.test.Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.Test.model.Employee;
import com.test.Test.service.EmployeeSevice;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeSevice employeeService;
	
	@PostMapping("/employees")
	public String addEmployees (@RequestBody Employee employee){
		try {
			employeeService.insertEmployee(employee);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Saved successfully";
		
	}
	
	@GetMapping("/taxdeductions")
	public Employee calculateTaxDeductions(@RequestParam("empcode") double empCode) {
		return null;
		
	}
}
