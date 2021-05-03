package com.learn.oops;

public class StaticBlockEx {
	
	static {
		System.out.println("Static block is executed");
	}
	
	static {
		System.out.println("Static block2 is executed");
	}
	
	public static void main(String[] args) {
		System.out.println("Main() started");
		
		System.out.println("Main() ended");
	}
}
