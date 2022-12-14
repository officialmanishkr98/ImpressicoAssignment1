package com.assignment1.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment1.app.entity.EmpData;
import com.assignment1.app.entity.Employee;
import com.assignment1.app.services.EmpServices;

@RestController
public class EmpController {
	
	@Autowired
	private EmpServices empServices; 
	
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody EmpData empData) {
		return empServices.addEmployee(empData);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		return empServices.getAllEmployee();
	}
	
	@PutMapping("/employee/{id}")
	public String updateEmployee( @RequestBody Employee emp , @PathVariable Integer id ) {
		return empServices.updateEmployee(emp, id);
	}
	
	
	@DeleteMapping("/employee/{id}")
	public String addEmployee(@PathVariable Integer id) {
		return empServices.deleteEmployee(id);
	}
	
}
