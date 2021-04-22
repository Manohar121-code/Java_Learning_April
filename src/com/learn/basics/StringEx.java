package com.learn.basics;

public class StringEx {
	public static void main(String[] args) {
		String s = "java is a programming language";
		System.out.println(s);
		
		int length = s.length();
		System.out.println("Length of s - "+ length);
		
		int index = 2;
		char ch = s.charAt(index);
		System.out.println("char at 2nd index - "+ ch);
		
		int indexOfA = s.indexOf('a');
		System.out.println("Index of a - "+ indexOfA);
		
		int indexOfAAfterSecondIndex = s.indexOf('a', 2);
		System.out.println("Index of a after second index - "+ indexOfAAfterSecondIndex);
		
		int lastIndexOfA = s.lastIndexOf('a');
		System.out.println("Last index of a - "+ lastIndexOfA);
	}
}
