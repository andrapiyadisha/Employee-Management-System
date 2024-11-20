package com.employee.crud.repository;

import com.employee.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
