package com.example.employeeService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeService.dto.APIResponseDto;
import com.example.employeeService.dto.DepartmentDto;
import com.example.employeeService.dto.EmployeeDto;
import com.example.employeeService.entity.Employee;
import com.example.employeeService.mapper.EmployeeMapper;
import com.example.employeeService.repository.EmployeeRepository;
import com.example.employeeService.service.APIClient;
import com.example.employeeService.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service

public class EmployeeServiceImpl implements EmployeeService {
@Autowired
	private EmployeeRepository employeeRepo;
//	private RestTemplate restTemplate;
//	private WebClient webClient;
	private APIClient apiClient;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepo.save(employee);
		EmployeeDto savedEmployeeDto = EmployeeMapper.mapToEmployeeDto(savedEmployee);
		return savedEmployeeDto;
	}

	@Override
	public APIResponseDto getEmployeeById(Long employeeId) {

		Employee employee = employeeRepo.findById(employeeId).get();
//		ResponseEntity<DepartmentDto> responseEntity = restTemplate.getForEntity(
//				"http://localhost:8080/api/departments/" + employee.getDepartmentCode(), DepartmentDto.class);
//
//		DepartmentDto departmentDto = responseEntity.getBody();
		
//		DepartmentDto departmentDto  =	webClient.get().uri("http://localhost:8080/api/departments/" + employee.getDepartmentCode())
//		.retrieve().bodyToMono(DepartmentDto.class).block();
		DepartmentDto departmentDto =apiClient.getDepartment(employee.getDepartmentCode());
						
		EmployeeDto employeeDto = EmployeeMapper.mapToEmployeeDto(employee);
		
		APIResponseDto apiResponseDto = new APIResponseDto();
		apiResponseDto.setEmployee(employeeDto);
        apiResponseDto.setDepartment(departmentDto);

		return apiResponseDto;
	}

}
