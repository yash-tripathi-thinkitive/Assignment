package com.thinkitive.day2.springdemo.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeExecutable {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee = context.getBean(Employee.class);
		// System.out.println(employee);
		Address address = new Address(421301, "Kalyan");
		Address address2 = new Address(400001, "Mumbai");
		List<Address> list = new ArrayList<Address>();
		list.add(address);
		list.add(address2);
		employee.setAddress(list);
		System.out.println(employee);

	}

}
