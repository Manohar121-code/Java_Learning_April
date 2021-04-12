package com.learn.basics;

public class IncrementDecrementEx {
	public static void main(String[] args) {
		int i = 10;
		i++;
		System.out.println("i value after increment - "+ i);
		
		int j = 5;
		j--;
		System.out.println("j value after decrement - "+ j);
		
		System.out.println("------------------------------------------");
		
		int k = 15;
		System.out.println(k++);
		System.out.println(k);
		
		System.out.println("---------");
		int r = 23;
		System.out.println(++r);
		System.out.println(r);
		
		System.out.println("-----------------------");
		
		int d = 50;
		System.out.println(d--);
		System.out.println(d);
		
		System.out.println("------------");
		int d2 = 75;
		System.out.println(--d);
	}
}
