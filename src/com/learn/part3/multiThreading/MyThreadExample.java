package com.learn.part3.multiThreading;

public class MyThreadExample {
	public static void main(String[] args) {
		System.out.println("Main started");
		MyThread t1 = new MyThread();
		t1.start();
		
		for (int i = 11; i <= 50; i++) {
			System.out.println(i);
		}
		
		System.out.println("Main ended");
	}
}
