package com.learn.part3.exceptionHandling;

import java.util.Scanner;

public class ThrowAndThrowsEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		Scanner scr = new Scanner(System.in);
		System.out.println("enter age");
		int age = scr.nextInt();
		try {
			checkEligibilityByUnCheckedExp(age);
		} catch (RuntimeException e) {
			System.out.println("RuntimeException occurred - "+e.getMessage());
		}
		
		System.out.println("---------------------");
		
		try {
			checkEligibilityByCheckedExp(age);
		} catch (Exception e) {
			System.out.println("Exception occurred - "+e.getMessage());
		}
		
		System.out.println("Main ended");
	}

	private static void checkEligibilityByCheckedExp(int age) throws Exception {
		if (age >= 18) {
			System.out.println("person is eligible for vote");
		} else {
			throw new Exception("Person is not eligible for vote");
		}
	}
	
	private static void checkEligibilityByUnCheckedExp(int age) {
		if (age >= 18) {
			System.out.println("person is eligible for vote");
		} else {
			throw new RuntimeException("Person is not eligible for vote");
		}
	}
}
