package com.addres.springcore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;

public class Employee {

	private Integer employeeId;
	private String employeeName;
	private Double salary;
	
	//@Autowired
	//@Qualifier("address2")
	@Resource(name = "address2")
	private Address address;
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Employee bean is intialized..");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Employee bean is going to destroy..");
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
}