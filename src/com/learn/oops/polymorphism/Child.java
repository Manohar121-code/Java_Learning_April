package com.learn.oops.polymorphism;

public class Child extends Parent {
	public void test() {
		System.out.println("Child test() called");
	}
	
//	public final void finalTest() {
//		System.out.println("Child finalTest() called");
//	}
	
	public static void staticTest() {
		System.out.println("Child staticTest() called");
	}
}
