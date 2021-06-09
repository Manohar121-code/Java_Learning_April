package com.learn.part3.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExpEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		File file = new File("D://sample/test.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException occurred - "+e.getMessage());
		}
		
		System.out.println("Main ended");
	}
}
