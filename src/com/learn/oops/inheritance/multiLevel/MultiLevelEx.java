package com.learn.oops.inheritance.multiLevel;

public class MultiLevelEx {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setMaxSpeed(100);
		v1.setMileage(20);
		v1.setCc(150);
		
		System.out.println("VEHICLE Properties");
		System.out.println("Max speed - "+v1.getMaxSpeed());
		System.out.println("Mileage - "+v1.getMileage());
		System.out.println("CC - "+v1.getCc());
		
		System.out.println("-------------------------------------");
		
		Car fortuner = new Car();
		fortuner.setMaxSpeed(200);
		fortuner.setMileage(15.4);
		fortuner.setCc(2000);
		fortuner.setGroundClearance(250);
		fortuner.setNumOfWheels(4);
		
		System.out.println("CAR Properties");
		System.out.println("Max speed - "+fortuner.getMaxSpeed());
		System.out.println("Mileage - "+fortuner.getMileage());
		System.out.println("CC - "+fortuner.getCc());
		System.out.println("Ground clearance - "+fortuner.getGroundClearance());
		System.out.println("Number of wheels - "+fortuner.getNumOfWheels());
		
		System.out.println("-------------------------------------");
		
		SuperCar bugatti = new SuperCar();
		bugatti.setMaxSpeed(400);
		bugatti.setMileage(10.5);
		bugatti.setCc(3500);
		bugatti.setGroundClearance(500);
		bugatti.setNumOfWheels(4);
		bugatti.setNumOfGears(8);
		bugatti.setNumOfSeats(2);
		bugatti.setRoofTop(true);
		
		System.out.println("SUPERCAR Properties");
		System.out.println("Max speed - "+bugatti.getMaxSpeed());
		System.out.println("Mileage - "+bugatti.getMileage());
		System.out.println("CC - "+bugatti.getCc());
		System.out.println("Ground clearance - "+bugatti.getGroundClearance());
		System.out.println("Number of wheels - "+bugatti.getNumOfWheels());
		System.out.println("Number of Gears - "+ bugatti.getNumOfGears());
		System.out.println("Number of Seats - "+ bugatti.getNumOfSeats());
		System.out.println("Is roof top - "+ bugatti.isRoofTop());
	}
}
