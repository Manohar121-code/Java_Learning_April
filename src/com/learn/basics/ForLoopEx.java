package com.learn.basics;

public class ForLoopEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("for loop executed - "+ i);
		}
		
		System.out.println("---------------------------");
		
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		
		System.out.println("Main ended");
		
	}
}
