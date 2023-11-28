package com.upskilling.employmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upskilling.employmentservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
