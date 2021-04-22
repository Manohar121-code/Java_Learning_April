package com.learn.basics.methods;

public class MethodWithArgAndReturnTypeEx {
	public static void main(String[] args) {
		System.out.println("main() started");
		
		int div = m1(15, 3);
		System.out.println("division value - "+ div);
		
		System.out.println("main() ended");
	}
	
	public static int m1(int i, int j) {
		System.out.println("m1() called");
		int div = i / j;
		return div;
	}
}
