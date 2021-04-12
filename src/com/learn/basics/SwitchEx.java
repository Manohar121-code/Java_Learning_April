package com.learn.basics;

public class SwitchEx {
	public static void main(String[] args) {
		int day = 1;
		switch (day) {
		case 1:
			System.out.println("case1 executed");
			break;
		case 2:
			System.out.println("case2 executed");
			break;
		case 3:
			System.out.println("case3 executed");
			break;
		default:
			System.out.println("default executed");
			break;
		}
		
		System.out.println("--------------------------------");
		
		String s = "Java";
		switch (s) {
		case "C":
			System.out.println("C language selected");
			break;
		case "C++":
			System.out.println("C++ language selected");
			break;
		case "Java":
			System.out.println("Java language selected");
			break;
		case "Python":
			System.out.println("Python language selected");
			break;
		default:
			System.out.println("Golang language selected");
			break;
		}
	}
}
