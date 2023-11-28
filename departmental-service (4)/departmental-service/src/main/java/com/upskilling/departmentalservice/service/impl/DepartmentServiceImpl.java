package com.upskilling.departmentalservice.service.impl;

import org.springframework.stereotype.Service;

import com.upskilling.departmentalservice.dto.DepartmentDto;
import com.upskilling.departmentalservice.entity.Department;
import com.upskilling.departmentalservice.mapper.DepartmentMapper;
import com.upskilling.departmentalservice.repository.DepartmentRepository;
import com.upskilling.departmentalservice.services.DepartmentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{
	private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        // convert department dto to department jpa entity
        Department department = DepartmentMapper.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);

        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {

        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);

        return departmentDto;
    }

}
