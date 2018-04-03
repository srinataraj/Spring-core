package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	public void insert(Employee e) {
		dao.insert(e);
	}
	public List<Employee> getEmployees() {
		return dao.getAllEmployees();
	}


}
