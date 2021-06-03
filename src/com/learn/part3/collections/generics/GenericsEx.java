package com.learn.part3.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		
		for (String s : list) {
			System.out.println(s);
		}
	}
}
