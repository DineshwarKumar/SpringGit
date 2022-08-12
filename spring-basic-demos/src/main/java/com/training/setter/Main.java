package com.training.setter;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Employee employee=new Employee(); employee.setEmployeeId(100);
		 * employee.setName("RajKumar"); employee.setSalary(25000);
		 * 
		 * System.out.println(employee);
		 */
			ApplicationContext context=new AnnotationConfigApplicationContext("com.training");
			Employee employee= (Employee) context.getBean("employee");
			System.out.println(employee);
			
			Employee employee1=context.getBean(Employee.class, "employee");
			System.out.println(employee1);
			
			Employee employee2=context.getBean(Employee.class);
			System.out.println(employee2);
			
			Address address=context.getBean(Address.class);
			System.out.println(address);
			
			System.out.println();
			
			String[] beans=context.getBeanDefinitionNames();
			for (String bean : beans) {
				System.out.println(bean);
			}
			System.out.println();
			System.out.println("Another way");
			Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
				
	}

}
