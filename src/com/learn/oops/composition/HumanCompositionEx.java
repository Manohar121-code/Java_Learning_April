package com.learn.oops.composition;

public class HumanCompositionEx {
	public static void main(String[] args) {
		
		Brain brainOfPurna = new Brain(1111, 3);
		Heart heartOfPurna = new Heart(100, true);
		
		Human purna = new Human("Purna", 6.3, 82.4, brainOfPurna, heartOfPurna);
		
		String name = purna.getName();
		double height = purna.getHeight();
		double weight = purna.getWeight();
		System.out.println("Name - "+ name);
		System.out.println("Height - "+ height);
		System.out.println("Weight - "+ weight);
		
		Brain brain = purna.getBrain();
		int numOfNuerons = brain.getNumOfNuerons();
		int iq = brain.getIq();
		System.out.println("Purna Brain Number of nuerons - "+ numOfNuerons);
		System.out.println("Purna Brain IQ - "+ iq);
		
		Heart heart = purna.getHeart();
		int heartRate = heart.getHeartRate();
		boolean heartQuality = heart.isHeartQuality();
		System.out.println("Purna Heart rate - "+ heartRate);
		if (heartQuality) {
			System.out.println("Purna Heart quality - Good");
		} else {
			System.out.println("Purna Heart quality - Bad");
		}
	}
}
