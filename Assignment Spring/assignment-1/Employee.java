package com.thinkitive.day2.springdemo2.assignment;

public class Employee {
	private int empid;
	private String ename;
	private int basicSalary;
	double HRA;
	double PF;
	static int PT=200;
	private int medicalAllowance;
	double grossSalary;
	double netSalary;

	
public Employee() {
	
}
	public Employee(int empid ,String ename,int basicSalary,int medicalAllowance) {
		super();
		this.empid=empid;
		this.ename = ename;
		this.basicSalary = basicSalary;
		this.medicalAllowance = medicalAllowance;
		
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getMedicalAllowance() {
		return medicalAllowance;
	}
	public void setMedicalAllowance(int medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}

	double calculateHra() {
		this.HRA=(this.basicSalary*0.5);
		return this.HRA;
	}
	void calculatePf() {
		this.PF=(this.basicSalary*12)/100;
	}
	void grossSalary() {
		this.grossSalary=this.basicSalary+this.HRA+this.medicalAllowance;
	}
	void netSalary() {
		this.netSalary=this.grossSalary-this.PF-PT;
	}
	void printData() {
		calculateHra();
		calculatePf();
		grossSalary();
		netSalary();
		System.out.println("ID :" + this.empid);
		System.out.println("NAME :" + this.ename);
		System.out.println("BasicSalary :" + this.basicSalary);
		System.out.println("HRA :" + this.HRA);
		System.out.println("PF :" + this.PF);
		System.out.println("PT :" + PT);
		System.out.println("MedicalAllowance :" + this.medicalAllowance);
		System.out.println("GrossSalary :" + this.grossSalary);
		System.out.println("NetSalary :" + this.netSalary);
	}
	
}
