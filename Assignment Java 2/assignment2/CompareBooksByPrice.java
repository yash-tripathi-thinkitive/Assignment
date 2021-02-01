package com.thinkitive.day9.assignment2;

import java.util.Comparator;

import com.thinkitive.day9.assignment.Book;

public class CompareBooksByPrice implements Comparator<Book>  {

	@Override
	public int compare(Book o1, Book o2) {
		
		if(o1.getPrice() > o2.getPrice()) {
			return 1;
		}
		else if (o1.getPrice() < o2.getPrice()) {
			return -1;
		}
		else 
			return 0;
	}

	
}
