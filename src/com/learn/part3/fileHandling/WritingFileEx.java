package com.learn.part3.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFileEx {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\test/sample.txt");
		String s = "If you learn core java well, that's 80 percent completed";
		fw.write(s);
		System.out.println("Write operation is successful");
		fw.close();
	}
}
