package com.learn.oops.inheritance.heirarchical;

public class Animal {
	private int numberOfLegs;
	private int iq;
	
	public Animal() {
		super();
	}

	public Animal(int numberOfLegs, int iq) {
		super();
		this.numberOfLegs = numberOfLegs;
		this.iq = iq;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

}
