package com.learn.part3.exceptionHandling;

public class ArithmeticExceptionEx {
	public static void main(String[] args) {
		int i = 10/2;
		try {
			System.out.println("try started");
			i = 20/2;
			System.out.println("try ended");
		} catch (ArithmeticException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block is executed");
		}
		System.out.println(i);
	}
}
