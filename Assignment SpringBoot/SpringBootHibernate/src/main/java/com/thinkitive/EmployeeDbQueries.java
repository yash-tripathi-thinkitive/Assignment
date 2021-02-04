package com.thinkitive;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDbQueries {
public void add(Employee e1) {
	Configuration cfg = new Configuration();
	SessionFactory factory = cfg.configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	session.save(e1);
	t.commit();
	session.close();
	factory.close();

	
}
}
