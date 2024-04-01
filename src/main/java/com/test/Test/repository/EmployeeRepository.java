package com.test.Test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.Test.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
