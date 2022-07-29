package com.employeeSpringProject.SpringEmployeeDetailsCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeSpringProject.SpringEmployeeDetailsCrud.Employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
