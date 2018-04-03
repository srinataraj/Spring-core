package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService)context.getBean("service");
		Employee employee = (Employee) context.getBean("employeeObject");
		
		List<Employee> employeeList = service.getEmployees();
		for(Employee e : employeeList) {
			System.out.println(e.getId()+ " "+e.getName()+" "+e.getSalary()+" "+e.getDesignation());
		}
	}

	}
	

