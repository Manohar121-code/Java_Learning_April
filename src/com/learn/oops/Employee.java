package com.learn.oops;

public class Employee {
	int empId;
	String empName;
	int salary;
	static String company;
	
	public void printEmployeeData() {
		System.out.println("Employee Id - "+ empId);
		System.out.println("Employee Name - "+ empName);
		System.out.println("Salary - "+ salary);
		System.out.println("Company - "+ company);
		System.out.println("-------------------------------");
	}
}
