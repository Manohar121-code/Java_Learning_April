package com.learn.basics;

public class BreakAndContinueEx {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("i value is - "+ i);
			
			if (i == 3) {
				break;
			}
		}
		
		System.out.println("--------------------------");
		
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			
			System.out.println("i value is - "+ i);
		}
	}
}
