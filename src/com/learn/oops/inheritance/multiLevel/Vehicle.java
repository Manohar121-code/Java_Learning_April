package com.learn.oops.inheritance.multiLevel;

public class Vehicle {
	private double mileage;
	private int maxSpeed;
	private int cc;
	
	public void startEngine() {
		System.out.println("Starting the engine");
	}
	
	public Vehicle() {
		super();
	}

	public Vehicle(double mileage, int maxSpeed, int cc) {
		this.mileage = mileage;
		this.maxSpeed = maxSpeed;
		this.cc = cc;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

}
