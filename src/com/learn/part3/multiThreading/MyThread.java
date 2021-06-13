package com.learn.part3.multiThreading;

public class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}
