package com.learn.part3.exceptionHandling;

public class MyExceptionEx {
	public static void main(String[] args) {
		try {
			test();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void test() throws MyException {
		throw new MyException("Throwing my own exception");
	}
}
