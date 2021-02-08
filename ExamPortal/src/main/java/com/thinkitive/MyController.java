package com.thinkitive;

import java.util.List;

import javax.websocket.Session;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyController {
	AdminQueries aq = new AdminQueries();
	TeacherQueries tq = new TeacherQueries();
	StudentQueries sq = new StudentQueries();
	ExamPages ex = new ExamPages();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String user() {
		return "Hello User";
	}

	@GetMapping(value = "/showusers")
	public List<User> getAllUsers() {
		return aq.displayAll();
	}

	@GetMapping(value = "/showstudents")
	public List<Student> getAllStudents() {
		return tq.displayAllMarks();
	}

	@GetMapping(value = "/showparticularstudent/{sid}")
	public Student getStudentMarks(@PathVariable("sid") Integer sid) {
		System.out.println(sid);
		return tq.getStudent(sid);
	}

	@GetMapping(value = "/showparticularuser/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		System.out.println(id);
		return aq.getUser(id);
	}

	@PostMapping(value = "/user")
	public User insertUser(@RequestBody User u) {
		System.out.println(u);
		aq.insertUser(u);
		return u;
	}

	@PostMapping(value = "/student")
	public Student marks(@RequestBody Student s) {
		System.out.println(s);
		tq.insertStudent(s);
		return s;
	}

	@PostMapping(value = "/questions")
	public ExamPages insertPaper(@RequestBody ExamPages ep) {
		System.out.println(ep);
		tq.insertExam(ep);
		return ep;
	}

	@PutMapping(value = "/modifyquestions")
	public ExamPages modifyPaper(@RequestBody ExamPages ep) {
		System.out.println(ep);
		tq.updateQuestions(ep);
		return ep;
	}
	@PostMapping(value = "/markscalculation")
	public ExamPages markscalc(@RequestBody ExamPages ep, @RequestParam(name ="sid")Integer sid,@RequestParam(name ="name")String name,int marks) {
		//System.out.println(ep);
		Student s = new Student(sid, name, marks);
		sq.calculateMarks(ep, marks, name, s);
		return ep;
	}


	@GetMapping(value = "/add")
	public ModelAndView credentials(String name, String password, String designation) {
		ModelAndView model = new ModelAndView();
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		org.hibernate.Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		User a = new User(name, password, designation);
		Criteria c = session.createCriteria(User.class);
		c.add(Restrictions.ilike("name", name));
		c.add(Restrictions.ilike("password", password));
		c.add(Restrictions.ilike("designation", designation));
		List l = c.list();
		if (l.size() != 0) {

			if (designation.equals("student")) {
				model.setViewName("exampage1.jsp");
			} else if (designation.equals("teacher")) {
				model.setViewName("teacher.jsp");
			}

		} else {
			model.setViewName("login.jsp");
		}

		return model;
	}

}
