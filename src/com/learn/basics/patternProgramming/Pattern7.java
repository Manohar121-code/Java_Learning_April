package com.learn.basics.patternProgramming;

//54321    1
//5432     2
//543      3
//54       4
//5        5
public class Pattern7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
