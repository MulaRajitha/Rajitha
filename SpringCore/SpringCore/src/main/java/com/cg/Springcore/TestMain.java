package com.cg.Springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beaninfo.xml");

		Address add = (Address) ctx.getBean("Add");

		System.out.println(add);

		ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("beaninfo.xml");

		Customer cu = (Customer) ct.getBean("cus");

		System.out.println(cu);

	}

}