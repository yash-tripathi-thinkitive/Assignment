package com.thinkitive.Dictionary.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maven.dictionary.Dictionary1;
import com.maven.dictionary.DictionaryDatabaseQueries;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public ModelAndView dbInsert(String word) {
		ModelAndView model = new ModelAndView();
		DictionaryDatabaseQueries dq = new DictionaryDatabaseQueries();
		dq.add(new Dictionary1(word));
		model.setViewName("successword.jsp");
		return model;
		
	}
	
}
