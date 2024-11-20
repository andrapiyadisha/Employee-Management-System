package com.employee.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String doj;
	private int status;
	private float salary;
	
	public Employee() {}
	
	public Employee(Long id, String name, String doj, int status, float salary) {
		this.id=id;
		this.name=name;
		this.doj=doj;
		this.status=status;
		this.salary=salary;
	}
	
	public Employee(String name, String doj, int status, float salary) {
		this.name=name;
		this.doj=doj;
		this.status=status;
		this.salary=salary;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getDoj() {
		return doj;
	}
	
	public void setDoj(String doj) {
		this.doj=doj;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary=salary;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status=status;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
