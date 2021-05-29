package com.learn.part3.arrays;

public class StringEx {
	public static void main(String[] args) {
		String s1 = "python";
		
		String s2 = "python";
		
		String strObj1 = new String("python");
		
		String strObj2 = new String("python");
		
		System.out.println(s1 == s2);
		System.out.println(strObj1 == strObj2);
		
		System.out.println("-------------------");
		
		System.out.println(s1.equals(s2));
		System.out.println(strObj1.equals(strObj2));
	}
}
