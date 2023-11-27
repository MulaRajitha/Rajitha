package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Student;
import com.example.repository.StudentRepository;

@RestController
@RequestMapping("/StudentManagement")
public class StudentController {

	@Autowired
	StudentRepository studentrepo;
	
	
	
	@PostMapping("/addstudents")
	public String AddStudentData(@RequestBody Student student) {
		studentrepo.save(student);
		return "student added:"+ student.getName();
	}
	@GetMapping("/students/{name}")
	public List<Student> getStudentByName(@PathVariable("name") String name){
		return studentrepo.findStudentByName(name);
		
	}
}
