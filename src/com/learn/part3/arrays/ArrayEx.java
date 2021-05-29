package com.learn.part3.arrays;

public class ArrayEx {
	public static void main(String[] args) {
		int[] arrOld = new int[5];
		int arr2[] = new int[5];
		int[] arr3 = {1,2,3,4,5};
		
		int k = 1;
		int rows = 3, cols = 3;
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = k++;
			}
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
