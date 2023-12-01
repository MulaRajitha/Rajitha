package com.example.employeeService.service;

import com.example.employeeService.dto.APIResponseDto;
import com.example.employeeService.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto saveEmployee(EmployeeDto employeeDto);
	APIResponseDto getEmployeeById(Long employeeId);
}
