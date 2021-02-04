package com.thinkitive;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController {
		@RequestMapping(value="/")
		public ModelAndView test(HttpServletResponse response) throws IOException{
			return new ModelAndView("home");
		}
		@RequestMapping(value="/add",method = RequestMethod.POST)
		public ModelAndView dbInsert(Integer empid, String ename) {
			ModelAndView model = new ModelAndView();
			EmployeeDbQueries ed = new EmployeeDbQueries();
			ed.add(new Employee(empid, ename));
			model.setViewName("successemployee.jsp");
			return model;
			
		}
}
