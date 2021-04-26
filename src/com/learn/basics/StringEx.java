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
		
		String substring1 = s.substring(2);
		System.out.println("substring from 2nd index - "+ substring1);
		
		String substring2 = s.substring(2, 13);
		System.out.println("substring from 2nd index to 16th index - "+ substring2);
		
		boolean equals = s.equals("java");
		System.out.println("equals - "+ equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("java is a programming LANGUAGE");
		System.out.println("equalsIgnoreCase - "+ equalsIgnoreCase);
		
		boolean empty = s.isEmpty();
		System.out.println("empty? - "+ empty);
		
		System.out.println("---------------------");
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------------");
		
		String upperCase = s.toUpperCase();
		System.out.println("to uppercase - "+ upperCase);
		
		String lowerCase = upperCase.toLowerCase();
		System.out.println("to lowercase - "+ lowerCase);
		
		String s2 = "  java is ";
		String trim = s2.trim();
		System.out.println(trim);
	}
}
