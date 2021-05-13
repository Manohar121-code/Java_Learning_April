package com.learn.oops.polymorphism;

public class MethodOverridingEx {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.test();
//		obj.privateTest();  //we can not able to access private in Child class, it won't come as part of inheritance
		obj.finalTest();
		obj.staticTest();
	}
}
