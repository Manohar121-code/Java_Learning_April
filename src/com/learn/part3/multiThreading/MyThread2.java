package com.learn.part3.multiThreading;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}

}
