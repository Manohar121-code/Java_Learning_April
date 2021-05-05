package com.learn.oops;

public class StudentMainEx {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollNum(10);
		s1.setName("Siva");
		
		int rollNum = s1.getRollNum();
		String name = s1.getName();
		
		System.out.println("Roll number for siva - "+ rollNum);
		System.out.println("Name - "+ name);
		
		System.out.println("-----------------------");
		
		Student s2 = new Student();
		s2.setRollNum(20);
		s2.setName("Mani");
		
		int rollNum2 = s2.getRollNum();
		String name2 = s2.getName();
		
		System.out.println("Roll number for Mani - "+ rollNum2);
		System.out.println("Name - "+ name2);
		
	}
}
