package com.learn.programs;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a digit");
		int n = scr.nextInt();
		int reminder = n % 2;
		if (reminder == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}
	}
}
