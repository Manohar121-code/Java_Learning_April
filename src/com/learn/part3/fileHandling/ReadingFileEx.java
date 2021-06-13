package com.learn.part3.fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFileEx {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\\\test/sample.txt");
		int i;
		while ((i = fr.read()) != -1) {
			char ch = (char) i;
			System.out.print(ch);
		}
		fr.close();
	}
}
