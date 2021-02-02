package com.thinkitive.day2.springdemo2.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ExecutableEmployee {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeassignment.xml");
		Employee employee = context.getBean(Employee.class);
		employee.printData();
		
	}

}
