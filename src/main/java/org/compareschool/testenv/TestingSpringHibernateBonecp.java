package org.compareschool.testenv;

import org.compareschool.domain.Professional;
import org.compareschool.utils.HibernateUtil;
import org.hibernate.Session;

public class TestingSpringHibernateBonecp {
	
	public static void main(String[] args) {
//		HibernateUtil hibernateUtil = null;	
		
	Session session = HibernateUtil.INSTANCE.getSession();	
	
	System.out.println("got the session");
	session.beginTransaction();
	System.out.println("Tx begins");
	Professional professional = new Professional();
	professional.setFirstName("Surendra");
	professional.setLastName("Jha");
	session.save(professional);
	System.out.println("data inserted!!");
	
	session.getTransaction().commit();
	
	System.out.println("yippiee!!");
	
	session.flush();
	session.close();
	}
}
