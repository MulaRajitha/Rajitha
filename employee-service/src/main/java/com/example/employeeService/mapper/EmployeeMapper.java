package com.example.employeeService.mapper;

import com.example.employeeService.dto.EmployeeDto;
import com.example.employeeService.entity.Employee;

public class EmployeeMapper {

	// convert Employee Entity to employeeDto
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		
		EmployeeDto employeeDto = new EmployeeDto(
				
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getDepartmentCode()
				);
		return employeeDto;
		
		}

	// convert employeeDto to employee Entity
	public static  Employee mapToEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee(
				employeeDto.getId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail(),
				employeeDto.getDepartmentCode()
				);
		return employee;
	}

}
