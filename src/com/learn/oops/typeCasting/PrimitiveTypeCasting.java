package com.learn.oops.typeCasting;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		int i = 20;
		long l = i; //widening
		
		System.out.println(i);
		System.out.println(l);
		
		long ln = 45;
		int i2 = (int) ln; //narrowing
		System.out.println(ln);
		System.out.println(i2);
	}
}
