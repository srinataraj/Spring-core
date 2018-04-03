package pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "s")
public class Student extends Person {
	private String grades;

	public Student(int uid, String name, String grades) {
		super(uid, name);
		this.grades = grades;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGrades() {
		return grades;
	}

	public void setGrades(String grades) {
		this.grades = grades;
	}
	
}

