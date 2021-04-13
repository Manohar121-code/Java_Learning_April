package com.learn.basics;

public class TernaryOperatorEx {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		String s;
		if (i > j) {
			s = "i is greater than j";
		} else {
			s = "j is greater than i";
		}
		
		System.out.println(s);
		
		String s2 = (i > j) ? "i is greater than j" : "j is greater than i";
		System.out.println(s2);
		
		System.out.println((i > j) ? "i is greater than j" : "j is greater than i");
	}
}
