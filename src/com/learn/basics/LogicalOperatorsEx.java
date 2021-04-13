package com.learn.basics;

public class LogicalOperatorsEx {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		if (i > j || j < 5 || j > i) {
			System.out.println("if - true");
		}
		
		if (i > j && j < 5 && j > i) {
			System.out.println("if - true");
		} else {
			System.out.println("else - true");
		}
		
		i = 30;
		j = 10;
		
		if (i < 1 || j > i || (j < 100 && i > j) ) {
			System.out.println("if - true");
		} else {
			System.out.println("else - true");
		}
	}
}
