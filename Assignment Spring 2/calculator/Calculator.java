package com.thinkitive.day1.springmvc.calculator;

import org.springframework.stereotype.Service;

@Service
	public class Calculator {
		public int add(int a,int b) {
			return a+b;
		}
}

