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
		int update = template.update("insert into employee values(?, ?, ?, ?)", 
					new Object[] {e.getId(), e.getName(), e.getSalary(), e.getDesignation()});
	}
	public List<Employee> getAllEmployees() {
		List<Employee> list = template.query("select * from employee", 
				new EmployeeRowMapper());
		return list;
	}

	
}


