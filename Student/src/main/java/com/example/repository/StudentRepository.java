package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Demo.Student;

public interface StudentRepository extends MongoRepository < Student, Long>{

 public	List<Student> findStudentByName(String name);
	

}
