package com.upskilling.departmentalservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upskilling.departmentalservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	Department findByDepartmentCode(String code);

}
