package com.thinkitive.day9.assignment2;



import java.util.Comparator;

import com.thinkitive.day9.assignment.Book;



public class CompareBooksByName implements Comparator<Book>  {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	

	

}

	
