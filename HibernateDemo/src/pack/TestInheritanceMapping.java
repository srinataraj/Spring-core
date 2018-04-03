package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestInheritanceMapping {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		// create 3 different type of objects
		Person p = new Person(111, "Raj");
		Customer c = new Customer(222, "Rahul", "HDFC");
		Student std = new Student(333, "Alex", "A");
		
		s.save(p);
		s.save(c);
		s.save(std);
		
		tx.commit();
		s.close();
		sf.close();		
	}

}
