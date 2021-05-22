package com.learn.oops.abstraction.abstarctClasses;

public class AbstractClassMainEx {
	public static void main(String[] args) {
		Employee obj = new EmpChild(); // upcasting
		printEmployeeMethods(obj);
	}
	
	private static void printEmployeeMethods(Employee obj) {
		obj.m1();
		obj.m2();
	}
}
