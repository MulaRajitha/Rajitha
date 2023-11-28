package com.upskilling.employmentservice.service;

import com.upskilling.employmentservice.dto.APIResponseDto;
import com.upskilling.employmentservice.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);

}
