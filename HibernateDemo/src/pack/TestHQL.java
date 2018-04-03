package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHQL {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		String hibernateQuery = "select obj1.name,obj1.salary from pack.Employee obj1 where name = 'sri'  ";
		Query query = s.createQuery(hibernateQuery);
       	@SuppressWarnings("rawtypes")
		List list = query.list();
       	@SuppressWarnings("rawtypes")
		Iterator it = list.iterator();
       	while(it.hasNext()) {
       		//Employee e = (Employee) it.next();
       		//System.out.println(e.getName()+ " "+e.getId());
       		Object[] obj = (Object[]) it.next();
       		String name = (String)obj[0];
       		Double salary =(Double)obj[1];
       		System.out.println(name + " "+salary);
       		
       		
       	}
       
       	s.close();
    	sf.close();
       	
       	
	}

}
