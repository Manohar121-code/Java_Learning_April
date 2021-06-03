package com.learn.part3.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add("abc");
		set.add("xyz");
		set.add("abc");
		
		System.out.println(set.size());
		System.out.println("------------------");
		for (Object obj : set) {
			System.out.println(obj);
		}
		
		System.out.println("---------------");
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Object next = itr.next();
			System.out.println(next);
		}
		
		Set set2 = new HashSet();
		set2.add(10);
		set2.add(30);
		set2.add(40);
		set2.add("abc");
		set2.add("mno");
		
		set.addAll(set2);
		
		System.out.println("------------------");
		for (Object obj : set) {
			System.out.println(obj);
		}
		
		set.removeAll(set2);
		
		System.out.println("------------------");
		for (Object obj : set) {
			System.out.println(obj);
		}
		
		System.out.println("--------------");
		System.out.println(set.contains(20));
	}
}
