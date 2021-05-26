package com.learn.oops.wrapperClasses;

public class WrapperClassesEx {
	public static void main(String[] args) {
		String s = "Java";
		
		int i = 10; //primitive
		Integer intObj = new Integer(i); //object //boxing
		int i2 = intObj.intValue(); //unboxing
		
		System.out.println(i);
		System.out.println(intObj);
		System.out.println(i2);
		
		double d = 12.34;
		Double doubleObj = new Double(d);//boxing
		double d2 = doubleObj.doubleValue(); //unboxing
		
		System.out.println(d);
		System.out.println(doubleObj);
		System.out.println(d2);
	}
}
