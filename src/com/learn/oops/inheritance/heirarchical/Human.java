package com.learn.oops.inheritance.heirarchical;

public class Human extends Animal {
	private int height;
	private String gender;

	public Human(int height, String gender) {
		super();
		this.height = height;
		this.gender = gender;
	}
	
	public Human(int numOfLegs, int iq, int height, String gender) {
		super(numOfLegs, iq);
		this.height = height;
		this.gender = gender;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
