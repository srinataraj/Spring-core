package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractRefreshableConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		int choice,ch;
		
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService)context.getBean("service");
		Employee employee = (Employee)context.getBean("EmployeeObject");		
		
	do {
		Scanner s = new Scanner(System.in);
		System.out.println("\n*****Employee Management System******\n");
		System.out.println("1)ADD  2)Delete by Id  3)Display All  4)Update by id  5)Exit");
		choice = s.nextInt();
		switch(choice) {
		case 1: System.out.println("*****Performing Insert******");
				System.out.println("Enter id");
				employee.setId(s.nextInt());
				System.out.println("Enter name");
				employee.setName(s.next());
				System.out.println("Enter salary");
				employee.setSalary(s.nextInt());
				System.out.println("Enter designation");
				employee.setDesignation(s.next());
				service.insert(employee);
				System.out.println("Employee Information Stored Successfully");
				System.out.println("*****Employee Management System******");
				break;
		case 2:	System.out.println("*****Performing Delete******");
				System.out.println("Enter id");
				employee.setId(s.nextInt());
				service.delete(employee);
				System.out.println("Employee Information Stored Successfully");
				System.out.println("*****Employee Management System******");
				break;
		case 3: System.out.println("*****Displaying all Employees******");
				
				List<Employee> employeeList = service.getEmployees();
				for(Employee e : employeeList) {
					System.out.println(e.getId()+ " "+e.getName()+" "+e.getSalary()+" "+e.getDesignation());
				}
				System.out.println("___And many more based on number of records in a table___");
				System.out.println("*****Employee Management System******");
				break;
		case 4:	System.out.println("Enter Id");
				int a = s.nextInt();
				do{
					System.out.println("****A submenu to update the following****");
					System.out.println("1. Name 2.Salary 3.Designation 4.Exit");
					ch = s.nextInt();
					switch(ch){
					case 1:System.out.println("Enter new name");
							 String n = s.next();
						     service.updates(a,n);
						     break;
					case 2:	System.out.println("Enter new Salary");
					   			int sal = s.nextInt();
					   		    service.updates1(a,sal);
					   		    break;
					case 3:  System.out.println("Enter new Designation");
							   employee.setDesignation(s.next());
							   service.updates2(employee);
							   break;
					case 4:	System.out.println("*****Submenu exit*****");
							
								break;
					}
				}while(ch<4);
				break;
		
		case 5:		System.out.println("Main menu exits");
					System.out.println("Thank you for visiting");		
					break;
		}
	}while(choice<5);
	}
	}



