package com.employeeSpringProject.SpringEmployeeDetailsCrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employeeSpringProject.SpringEmployeeDetailsCrud.Employee.Employee;
import com.employeeSpringProject.SpringEmployeeDetailsCrud.Service.EmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	
	@RequestMapping("/new")
	public String createProduct(Model model) {
	    Employee employee = new Employee();
	    model.addAttribute("employee", employee);
		return "new";
	}
	
	
	@RequestMapping("/get_complains")
	public String getEmployee(Model model) {
		List<Employee> employees = service.listAll();
		model.addAttribute("employees", employees);
		return "get_all_employees";
	}
	
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String postEmployeeSave(@ModelAttribute("employee") Employee employee) {
		System.out.println(employee);
		service.save(employee);
		return "redirect:/get_complains";
	}
	
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editEmployeeSave(@PathVariable(name="id") int id) {
		ModelAndView mav = new ModelAndView("edit_employee");
		System.out.println(mav);
		Employee employee = service.get(id);
		System.out.println(employee);
		mav.addObject("employee",employee);
		
		return mav;
	}
	
	
	
	@RequestMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable(name="id") int id) {
		service.delete(id);
		return "redirect:/get_complains";
	}
	
	
	
}
