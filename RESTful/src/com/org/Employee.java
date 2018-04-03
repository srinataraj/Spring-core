
	package com.org;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.xml.bind.annotation.XmlRootElement;

	@Entity
	@XmlRootElement
	public class Employee {
		
		@Id
		private Integer id;
		private String name;
		private Double salary;
		public Employee(Integer id, String name, Double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		
		
	}



