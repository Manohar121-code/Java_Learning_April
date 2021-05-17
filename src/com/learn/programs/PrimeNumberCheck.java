package com.learn.programs;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		int n = 17;
		boolean isPrimeNumber = true;
		for (int i = 2; i <= n/2; i++) {
			int reminder = n % i;
			if (reminder == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		if (isPrimeNumber) {
			System.out.println(n +" is a prime number");
		} else {
			System.out.println(n +" is not a prime number");
		}
	}
}
