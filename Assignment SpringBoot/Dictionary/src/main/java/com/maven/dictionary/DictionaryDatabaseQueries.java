package com.maven.dictionary;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DictionaryDatabaseQueries {
	public void add(Dictionary1 d1) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(d1);
		t.commit();
		session.close();
		factory.close();

	}
	public List displayEmployee() {
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		List l = session.createQuery("From Dictionary1").list();
		tx.commit();

		session.close();
		factory.close();
		return l;
	}
}
