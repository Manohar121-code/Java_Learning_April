package com.learn.oops.polymorphism;

public class Parent {
	public void test() {
		System.out.println("Parent test() called");
	}
	
	private void privateTest() {
		System.out.println("Parent privateTest() called");
	}
	
	public final void finalTest() {
		System.out.println("Parent finalTest() called");
	}
	
	public static void staticTest() {
		System.out.println("Parent staticTest() called");
	}
	
}
