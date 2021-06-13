package com.learn.part3.multiThreading;

public class MyThread2Example {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main started");
		
		MyThread2 myThread2 = new MyThread2();
		Thread t1 = new Thread(myThread2);
		t1.setName("t1");
//		t1.setDaemon(true);
		t1.setPriority(5);
		t1.start();
		
		t1.join();
		
		System.out.println("main thread starts execution");
		Thread.sleep(2000);
		
		for (int i = 11; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+ i);
		}
		
		System.out.println("Main ended");
	}
}
