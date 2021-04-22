package com.learn.basics.methods;

public class MethodsWithReturnTypeEx {
	public static void main(String[] args) {
		System.out.println("main() started");

		int i = m1();
		System.out.println("returned value - "+ i);

		System.out.println("main() ended");
	}

	public static int m1() {
		System.out.println("m1() called");
		int i = 10;
		return i;
	}
}
