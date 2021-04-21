package com.learn.basics;

public class ArraysBasicsEx {
	public static void main(String[] args) {
		int i3 = 10;
//		<datatype>[] <identifier> = new <datatype>[size];
//		int arr2[] = new int[5];
		int[] arr = new int[5];
		arr[0] = 10;
		
		int zeroIndex = arr[0];
		System.out.println("zero index - "+ zeroIndex);
		
		System.out.println("-------------------");
		
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int len = arr.length;
		
		for(int i = 0; i < len; i++) {
			int val = arr[i];
			System.out.println(val);
		}
		
		System.out.println("---------------------");
		
		System.out.print("first line ");
		System.out.println("sample text ");
	}
}
