package com.learn.oops.constructor;

public class Student {
	private int rollNum;
	private String name;
	private int standard;
	
	public Student() {
		System.out.println("Constructor called");
	}
	
	public Student(int rollNum, String name, int standard) {
		this.rollNum = rollNum;
		this.name = name;
		this.standard = standard;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

}
