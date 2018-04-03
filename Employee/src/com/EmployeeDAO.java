package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	@Autowired
	private JdbcTemplate template;
	
	public void insert(Employee e) {
		 template.update("insert into employee values(?, ?, ?, ?)", 
					new Object[] {e.getId(), e.getName(), e.getSalary(), e.getDesignation()});
	}
	public void delete(Employee e) {
		 template.update("Delete from employee where id = ?",new Object[] {e.getId()});
	}
	public List<Employee> getAllEmployees() {
		List<Employee> list = template.query("select * from employee", 
				new EmployeeRowMapper());
		return list;
	}
	public void updates(int id,String name) {
		
		template.update("update employee set name = ? where id = ?",
	     new Object[] {name, id});
	      
	      
	}
	public void updates1(int id, int sal) {
		template.update("update employee set salary = ? where id = ?",
	     new Object[] {sal, id});
	}
		public void updates2(Employee e) {
			template.update("update employee set designation = ? where id = ?",
		     new Object[] {e.getId(), e.getDesignation()});

		}
}


