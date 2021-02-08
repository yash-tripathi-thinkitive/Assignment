package com.thinkitive;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentQueries {
	
	List<Student> list = new ArrayList<Student>();
	List<ExamPages> list2 = new ArrayList<ExamPages>();
	public List<Student> displayAllMarks() {
	
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

	public void calculateMarks(ExamPages ep,Integer number,String correctoption,Student s) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		int count=0;
		Query query = session.createQuery("From ExamPages");
		List<ExamPages> qList = query.list();
		for (int i = 0; i < qList.size(); i++) {
			if(qList.get(i).getCorrectoption().equals(correctoption)&&qList.get(i).getNumber().equals(number)) {
				count++;
			}
		}
		System.out.println(count);
		s.setMarks(count);
		t.commit();
		session.close();
		factory.close();	
	}
	public void storeMarks(Student s, Integer count) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		s.setMarks(count);
		session.update(s);
		t.commit();
		session.close();
		factory.close();
		
	}
}
