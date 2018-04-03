package pack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestCRUD {

	public static void main(String[] args) {
		System.out.println("update");
		Scanner sc = new Scanner(System.in);
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		System.out.println("enter an id");
		int tempid = sc.nextInt();
		sc.nextLine();
		Employee e = (Employee) s.get(Employee.class,tempid);
		if(e!=null) {
			System.out.println("old name 2"+e.getName());
			System.out.println("enter new name");
			String tempname = sc.nextLine();
			e.setName(tempname);
			System.out.println("new name "+e.getName());
			//s.update(e);
			s.delete(e);
			tx.commit();
		}
		else
		{
			System.err.println("sorry id not found");
			
		}
		s.close();
		sf.close();
		sc.close();
		
		

	}

}
