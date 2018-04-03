package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	public void insert(Employee e) {
		dao.insert(e);
	}
	public void delete(Employee e) {
		dao.delete(e);
	}
	public List<Employee> getEmployees() {
		return dao.getAllEmployees();
	}
	public void updates(int a, String n) {
		dao.updates(a,n);
	}
	public void updates1(int a, int sal) {
		dao.updates1(a, sal);
	}
	public void updates2(Employee e) {
		dao.updates2(e);
	}


}
