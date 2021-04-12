package com.learn.basics;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter a digit");
		int i = scr.nextInt();
		System.out.println("entered value - " + i);
		
		System.out.println("-----------");
		
		System.out.println("enter a word");
		String s = scr.nextLine();
		System.out.println("entered value - "+ s);
	}
}
