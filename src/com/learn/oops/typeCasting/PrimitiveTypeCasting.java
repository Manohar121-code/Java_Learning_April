package com.learn.oops.typeCasting;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		int i = 20;
		long l = i; //widening
		
		System.out.println(i);
		System.out.println(l);
		
		long ln = 1100;
		int i2 = (int) ln; //narrowing
		System.out.println(ln);
		System.out.println(i2);
		
		char ch = 'A';
		int charInt = ch; //widening
		System.out.println(ch);
		System.out.println(charInt);
		
		double d = 1234.567;
		long longVal = (long) d; //narrowing
		System.out.println(d);
		System.out.println(longVal);
	}
}
