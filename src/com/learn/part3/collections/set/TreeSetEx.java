package com.learn.part3.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(5);
		set.add(20);
		set.add(10);
		set.add(8);
		set.add(17);
		
		System.out.println(set.size());
		
		System.out.println("-----------");
		for (Integer i : set) {
			System.out.println(i);
		}
	}
}
