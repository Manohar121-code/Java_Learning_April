package com.learn.oops.constructor;

public class Employee {
	private int empId;
	private String empName;
	private long salary;
	
//	<access modifier> <class_name>() {
//		
//	}
	
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, long salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}
