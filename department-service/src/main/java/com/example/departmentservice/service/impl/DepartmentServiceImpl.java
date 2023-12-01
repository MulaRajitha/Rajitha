package com.example.departmentservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departmentservice.dto.DepartmentDto;
import com.example.departmentservice.entity.Department;
import com.example.departmentservice.mapper.DepartmentMapper;
import com.example.departmentservice.repository.DepartmentRepository;
import com.example.departmentservice.service.DepartmentService;

import lombok.AllArgsConstructor;

@Service

public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
	private DepartmentRepository departmentRepo;

	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

		// convert department dto to department jpa entity

		Department department = DepartmentMapper.mapToDepartment(departmentDto);
		Department savedDepartment = departmentRepo.save(department);
		// convert department Entity to departmentDto
		DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);
		return savedDepartmentDto;
	}

	@Override
	public DepartmentDto getDepartmentByCode(String departmentCode) {
		
		Department department = departmentRepo.findByDepartmentCode(departmentCode);
		
		DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);
		// TODO Auto-generated method stub
		return departmentDto;
	}

}
