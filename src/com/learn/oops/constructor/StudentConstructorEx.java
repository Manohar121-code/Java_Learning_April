package com.learn.oops.constructor;

public class StudentConstructorEx {
	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.setRollNum(1);
		obj1.setName("some name");
		obj1.setStandard(5);
		
		Student obj2 = new Student(2, "Mahesh", 7);
	}
}
