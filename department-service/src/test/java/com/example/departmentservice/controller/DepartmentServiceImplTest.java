package com.example.departmentservice.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.departmentservice.dto.DepartmentDto;
import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import com.example.departmentservice.service.impl.DepartmentServiceImpl;

public class DepartmentServiceImplTest {
@Mock
private DepartmentRepository departmentRepository;

@InjectMocks
private DepartmentServiceImpl departmentService;

@BeforeEach
void setUp() {
    MockitoAnnotations.openMocks(this);
}

@Test
void testSaveDepartment() {
    // Given
    DepartmentDto departmentDto = new DepartmentDto();
    departmentDto.setId(1L);
    departmentDto.setDepartmentName("IT");
    departmentDto.setDepartmentDescription("Information Technology Department");
    departmentDto.setDepartmentCode("IT");

    Department department= new Department(
    		departmentDto.getId(),
    		departmentDto.getDepartmentName(),
    		departmentDto.getDepartmentDescription(),
    		departmentDto.getDepartmentCode()
    		);

    when(departmentRepository.save(any())).thenReturn(department);

    // When
    DepartmentDto savedDepartmentDto = departmentService.saveDepartment(departmentDto);

    // Then
    assertEquals(departmentDto.getId(), savedDepartmentDto.getId());
    assertEquals(departmentDto.getDepartmentName(), savedDepartmentDto.getDepartmentName());
    assertEquals(departmentDto.getDepartmentDescription(), savedDepartmentDto.getDepartmentDescription());
    assertEquals(departmentDto.getDepartmentCode(), savedDepartmentDto.getDepartmentCode());

    verify(departmentRepository, times(1)).save(any());
}

@Test
void testGetDepartmentByCode() {
    // Given
    String departmentCode = "IT";
    Department department = new Department();
    department.setId(1L);
    department.setDepartmentName("IT");
    department.setDepartmentDescription("Information Technology Department");
    department.setDepartmentCode(departmentCode);

    when(departmentRepository.findByDepartmentCode(departmentCode)).thenReturn(department);

    // When
    DepartmentDto retrievedDepartmentDto = departmentService.getDepartmentByCode(departmentCode);

    // Then
    assertEquals(department.getId(), retrievedDepartmentDto.getId());
    assertEquals(department.getDepartmentName(), retrievedDepartmentDto.getDepartmentName());
    assertEquals(department.getDepartmentDescription(), retrievedDepartmentDto.getDepartmentDescription());
    assertEquals(department.getDepartmentCode(), retrievedDepartmentDto.getDepartmentCode());

    verify(departmentRepository, times(1)).findByDepartmentCode(departmentCode);
}
}

