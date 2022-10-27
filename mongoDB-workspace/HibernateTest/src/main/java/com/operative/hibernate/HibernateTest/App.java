package com.operative.hibernate.HibernateTest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	private static SessionFactory factory;
	public static void main( String[] args )
	{
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Student st = new Student();

		//INSERT THE DATA
		//       st.setId(1);
		//       st.setCity("pune");
		//       st.setName("adi");
		//       session.save(st);

//		//FETCH THE WHOLE DATA
//		Query q = session.createQuery("from Student");
//		List<Student> l = q.list();
//		for(Student stu : l) {
//			System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getCity());
//		}
		
//		//FETCH THE SINGLE RECORD
//				Query q = session.createQuery("from Student where id=:i");
//				q.setParameter("i", 1);
//			Student stu=	(Student) q.getSingleResult();
//			System.out.println(stu.getCity()+" "+stu.getName());
			
			//UPDATE RECORD
			Query q = session.createQuery("update Student set name='shahi' where id=:i");
			q.setParameter("i", 1);
		int result = q.executeUpdate();
		System.out.println(result);

		t.commit();       
		session.close();
		factory.close();
	}
}
