package com.learn.programs;

public class FindAnElementInArray {
	public static void main(String[] args) {
		int[] arr = { 4, 7, 5, 6, 3, 8, 10, 9 };
		int k = 6;
		boolean found = findNumber(arr, k);
		if (found) {
			System.out.println(k + " is found in array");
		} else {
			System.out.println(k + " is not found in array");
		}
	}

	private static boolean findNumber(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return true;
			}
		}
		return false;
	}
}
