package com.employee.crud.controller;

import com.employee.crud.entity.Employee;
import com.employee.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")

@RestController
public class EmployeeController {
	
	 @Autowired
	 private EmployeeService employeeService;
	 
	 
	 @PostMapping("/api/employee")
	 public Employee saveEmployee(@RequestBody Employee employee) {
		 return employeeService.saveEmployee(employee);
	 }
	 
	 @GetMapping("/api/employee")
	 public List<Employee> getAllEmployee(){
		 return employeeService.fetchAllEmployee();
	 }
	 
	 @GetMapping("/api/employee/{id}")
	 public Employee getEmployeeById(@PathVariable("id") Long id) {
		 return employeeService.getEmployeeById(id);
	 }
	 
	 @PutMapping("/api/employee/{id}")
	 public Employee updateEmployeeById(@PathVariable("id") Long id, @RequestBody Employee employee) {
		 return employeeService.updateEmployeeById(id, employee);
	 }
	 
	 @DeleteMapping("/api/employee/{id}")
	 public String deleteEmployeeById(@PathVariable("id") Long id) {
		 return employeeService.deleteEmployeeById(id);
	 }
}
