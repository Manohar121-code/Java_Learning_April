package com.learn.part3.exceptionHandling;

public class MultiCatchBlockEx {
	public static void main(String[] args) {
		int i = 10/2;
		try {
			System.out.println("try started");
			i = 20/0;
			System.out.println("try ended");
		} catch (NullPointerException e) {
			System.out.println("catch block executed - Nullpointer exception");
		} catch (ArithmeticException e) {
			System.out.println("catch block executed - Arithmetic exception");
		} catch (RuntimeException e) {
			System.out.println("catch block executed - Runtime exception");
		} finally {
			System.out.println("finally block is executed");
		}
		System.out.println(i);
	}
}
