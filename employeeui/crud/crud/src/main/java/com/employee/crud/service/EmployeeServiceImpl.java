package com.employee.crud.service;

import com.employee.crud.entity.Employee;
import com.employee.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@Override
	public List<Employee> fetchAllEmployee(){
		List<Employee> allEmployees = employeeRepository.findAll();
		return allEmployees;
	}
	
	@Override
	public Employee getEmployeeById(Long id){
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}else {
			return null;
		}
	}
	
	@Override
	public Employee updateEmployeeById(Long id, Employee employee) {
		Optional<Employee> employee1 =employeeRepository.findById(id);
		if(employee1.isPresent()) {
			Employee originalEmployee = employee1.get();
			if(Objects.nonNull(employee.getName()) && !"".equalsIgnoreCase(employee.getName())) {
				originalEmployee.setName(employee.getName());
			}
			if(Objects.nonNull(employee.getDoj()) && employee.getDoj()!="") {
				originalEmployee.setDoj(employee.getDoj());
			}
			if(Objects.nonNull(employee.getSalary()) && employee.getSalary()!=0) {
				originalEmployee.setSalary(employee.getSalary());
			}
			if(Objects.nonNull(employee.getStatus()) && employee.getStatus()!= -1) {
				originalEmployee.setStatus(employee.getStatus());
			}
			return employeeRepository.save(originalEmployee);
		}
		return null;
	}
	
	@Override
	public String deleteEmployeeById(Long id) {
		if(employeeRepository.findById(id).isPresent()) {
			employeeRepository.deleteById(id);
			return "Employee Deleted Successfully";
		}
		return "Employee by this ID doesn't Exisit";
	}
	
}
