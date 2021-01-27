package com.thinkitive.day4.assignment;

public abstract class DessertItem {
String name;


final String getName() {
	return name;
}
public DessertItem() {
}
public DessertItem(String name) {
	this.name = name;
	
	
}
public abstract double costOfItem();
}
