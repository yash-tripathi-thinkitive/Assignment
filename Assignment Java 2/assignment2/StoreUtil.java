package com.thinkitive.day9.assignment2;

import java.util.List;
import java.util.ArrayList;

public class StoreUtil<T> {
	List<T> al = new ArrayList<T>();
public void addRecords(T data) {
al.add(data);

}
public List<T> getRecords() {
	return this.al;
}
public void getNumOfRecords() {
	System.out.println(al.size());
}
}
