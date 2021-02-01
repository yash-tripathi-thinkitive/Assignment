package com.thinkitive.day9.assignment2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.thinkitive.day9.assignment.Book;

public class BookExecutable<T> extends StoreUtil<T> {

	public static void main(String[] args) {
		Set<String> authors1 = new HashSet<String>();
		Set<String> authors2 = new HashSet<String>();
		Set<String> authors3 = new HashSet<String>();
		authors1.add("aa");
		authors1.add("aa");
		authors2.add("aa");
		authors2.add("aa");
		authors3.add("aa");
		authors3.add("aa");
		Book b = new Book(1, "HP", authors1, 1000);
		Book b1 = new Book(2, "HP", authors2, 2000);
		Book b2 = new Book(3, "HP", authors3, 878);
		Book b3 = new Book(4, "HP", authors1, 8999);
		StoreUtil<Book> st = new StoreUtil<Book>();
		st.addRecords(b);
		st.addRecords(b1);
		st.addRecords(b2);
		st.addRecords(b3);
		List<Book> books = st.getRecords();
		PrintUtil.printRecords(books);
		SortUtils.sortByName(books);
		SortUtils.sortByPrice(books);
		PrintUtil.printRecords(books);

	}

}
