package com.learn.oops.encapsulation.singletonClass;

public class SingletonEx {
	public static void main(String[] args) {
		Sample obj1 = Sample.getInstance();
		Sample obj2 = Sample.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("-------------------");
		
		for (int i = 1; i <= 10; i++) {
			Sample instance = Sample.getInstance();
			System.out.println(instance);
		}
	}
}
