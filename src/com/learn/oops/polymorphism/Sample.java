package com.learn.oops.polymorphism;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		test();
		test(10);
		test("java");
		test(20, "Python");
		test("Golang", 30);
		
		System.out.println("Main method ended");
	}
	
	public static void test() {
		System.out.println("test() called");
	}
	
	public static void test(int i) {
		System.out.println("test(int i) called " + i);
	}
	
	public static void test(String s) {
		System.out.println("test(String s) called " + s);
	}
	
	public static void test(int i, String s) {
		System.out.println("test(int i, String s) called " + i +" - "+ s);
	}
	
	public static void test(String s, int i) {
		System.out.println("test(String s, int i) called "+ s + " - "+ i);
	}
}
