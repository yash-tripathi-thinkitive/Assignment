package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@RestController
public class AdminQueries {
	List<User> list = new ArrayList<User>();
	public void insertUser(User u) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		list.add(u);
		session.save(u);
		t.commit();
		session.close();
		factory.close();
	}
	public User getUser(Integer id) {
		
		User temp = null;
		for (User u : list) {
			if (u.getId() == id)
				temp = u;
		}
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		t.commit();
		session.close();
		factory.close();
		return temp;
	}
	public void deleteStudent(User u) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.delete(u);
		t.commit();
		session.close();
		factory.close();
	}
	public List<User> displayAll() {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		List l = session.createQuery("From User").list();
		System.out.println(l);
		t.commit();
		session.close();
		factory.close();
		return l;
	}
	public void update(User u) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		list.set(list.indexOf(u), u);
		t.commit();
		session.close();
		factory.close();
	}
	

}
