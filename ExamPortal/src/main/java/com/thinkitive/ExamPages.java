package com.thinkitive;

public class ExamPages {
	private Integer number;
	private String questions;
	private String option1;
	private String option2;
	private String option3;
	private String correctoption;

	public ExamPages() {
		// TODO Auto-generated constructor stub
	}

	public ExamPages(int number, String questions, String option1, String option2, String option3) {
		super();
		this.number = number;
		this.questions = questions;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.correctoption = correctoption;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getCorrectoption() {
		return correctoption;
	}

	public void setCorrectoption(String correctoption) {
		this.correctoption = correctoption;
	}

}
