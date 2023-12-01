package com.example.employeeService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeService.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
