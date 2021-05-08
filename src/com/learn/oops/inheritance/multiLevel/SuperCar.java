package com.learn.oops.inheritance.multiLevel;

public class SuperCar extends Car {
	private int numOfGears;
	private int numOfSeats;
	private boolean isRoofTop;

	public SuperCar() {

	}

	public int getNumOfGears() {
		return numOfGears;
	}

	public void setNumOfGears(int numOfGears) {
		this.numOfGears = numOfGears;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public boolean isRoofTop() {
		return isRoofTop;
	}

	public void setRoofTop(boolean isRoofTop) {
		this.isRoofTop = isRoofTop;
	}

}
