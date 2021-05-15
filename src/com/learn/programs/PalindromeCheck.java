package com.learn.programs;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter a string");
		String s = scr.next();
		while (!s.equals("-1")) {
			String rev = "";
			for (int i = s.length()-1; i >= 0; i--) {
				char ch = s.charAt(i);
				rev = rev + ch;
			}
			if (s.equals(rev)) {
				System.out.println(s + " is a palindrome");
			} else {
				System.out.println(s + " is not a palindrome");
			}
			System.out.println("----------------------------");
			
			System.out.println("enter a string");
			s = scr.next();
		}
	}
}
