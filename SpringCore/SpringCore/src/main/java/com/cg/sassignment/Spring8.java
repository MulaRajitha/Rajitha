package com.cg.sassignment;

import org.springframework.context.ApplicationContext;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.annotation.PostConstruct;

import jakarta.annotation.PreDestroy;

class Student {

	String name;

	public Student(String name) {

		super();

		this.name = name;

	}

	public String getName() {

		return name;

	}

	public void getDetails() {

		System.out.println("Name of students is:" + getName());

	}

	@PostConstruct

	public void myInit()

	{

		System.out.println("myInit method started");

	}

	@PreDestroy

	public void myDestroy() {

		System.out.println("myInit is Destroyed");

	}

}

public class Spring8 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")

		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");

		((ConfigurableApplicationContext) context).registerShutdownHook();

		Student obj = (Student) context.getBean("Student");

		obj.getDetails();

	}

}