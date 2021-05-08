package com.learn.oops.inheritance.multiLevel;

public class Car extends Vehicle {
	private int numOfWheels;
	private int groundClearance;
	
	public Car() {
		super();
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public int getGroundClearance() {
		return groundClearance;
	}

	public void setGroundClearance(int groundClearance) {
		this.groundClearance = groundClearance;
	}
	
}
