package com.learn.oops.abstraction.interfaces.inheritance;

public class SimpleInheritanceEx {
	public static void main(String[] args) {
		Interface1 obj = new SimpleInheritanceImpl();
		obj.m1();
		
		System.out.println("----------------");
		
		Interface2 obj2 = new SimpleInheritanceImpl();
		obj2.m1();
		obj2.m2();
	}
}
