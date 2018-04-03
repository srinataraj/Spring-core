package pack;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction; 


public class TestHibernate {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
	/*	org.hibernate.Transaction tx = s.beginTransaction();
		Employee emp = new Employee(777, "srini", 35000);
		s.save(emp);
		tx.commit();*/
		Employee e = (Employee) s.get(Employee.class,  555);
		
		s.close();
		sf.close();
		System.out.println("********DONE******");
		
		
	}

}
