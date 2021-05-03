package com.learn.oops;

public class StaticNonstaticAccessEx {
	public static void main(String[] args) {
		m2();
	}
	
	public void m1() {
		m2();
		m3();
	}
	
	public void m3() {
		m1();
		m2();
	}
	
	public static void m2() {
		
	}	
}
