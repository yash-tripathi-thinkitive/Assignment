package com.thinkitive;

public class Student {

	private Integer sid;
	private String name;
	private Integer marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer sid, String name, Integer marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
	

}
