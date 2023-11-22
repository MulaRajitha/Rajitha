package com.addres.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = null;
		
		try {
			//Creating Instance of ApplicationContext Spring Container
			applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			//Asking Spring Container to return Spring bean with Specific Id or name
			Employee employee = (Employee) applicationContext.getBean("employee");
			System.out.println(employee);
			Address address = employee.getAddress();
			//Address address = (Address) applicationContext.getBean("address");
			System.out.println(address);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (applicationContext != null)
				((AbstractApplicationContext) applicationContext).close();
		}
	}
}