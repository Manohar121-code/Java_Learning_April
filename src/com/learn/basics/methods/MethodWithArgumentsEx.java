package com.learn.basics.methods;

public class MethodWithArgumentsEx {
	public static void main(String[] args) {
		System.out.println("main() started");
		
		m1(15);
		
		System.out.println("main() ended");
	}
	
	public static void m1(int j) {
		System.out.println("m1() called");
		System.out.println("j argument value - "+ (++j) );
	}
}
