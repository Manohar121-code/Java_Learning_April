package com.learn.oops;

public class EmployeeMainEx {
	public static void main(String[] args) {
		
		Employee.company = "Paypal";
		
		Employee muni = new Employee();
		muni.empId = 1;
		muni.empName = "Muni";
		muni.salary = 86788;
		muni.printEmployeeData();
		
		Employee purna = new Employee();
		purna.empId = 2;
		purna.empName = "Purna";
		purna.salary = 68789;
		purna.company = "Walmart";
		purna.printEmployeeData();
		
		muni.printEmployeeData();
	}
}
