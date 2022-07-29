package com.employeeSpringProject.SpringEmployeeDetailsCrud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeeSpringProject.SpringEmployeeDetailsCrud.Employee.Employee;
import com.employeeSpringProject.SpringEmployeeDetailsCrud.repository.EmployeeRepository;


@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> listAll(){
		return repo.findAll();
	}
	
	public Employee get(int id) {
		return repo.findById(id).get();
	}
	
	public void save(Employee employee) {
		repo.save(employee);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
}
