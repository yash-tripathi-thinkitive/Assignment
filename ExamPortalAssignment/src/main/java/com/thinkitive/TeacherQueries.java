package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TeacherQueries {
	List<Student> list = new ArrayList<Student>();
	List<ExamPages> list2 = new ArrayList<ExamPages>();

	public void insertStudent(Student s) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		list.add(s);
		session.save(s);
		t.commit();
		session.close();
		factory.close();
	}

	public void insertExam(ExamPages ep) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		list2.add(ep);
		session.save(ep);
		t.commit();
		session.close();
		factory.close();
	}

	public Student getStudent(Integer sid) {

		Student temp = null;
		for (Student s : list) {
			if (s.getSid() == s.getSid())
				temp = s;
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

	public List<Student> displayAllMarks() {

		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		List l = session.createQuery("From Student").list();
		System.out.println(l);
		t.commit();
		session.close();
		factory.close();
		return l;
	}

	public void updateQuestions(ExamPages ep) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.update(ep);
		t.commit();
		session.close();
		factory.close();

	}

}
