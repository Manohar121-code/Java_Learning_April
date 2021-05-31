package com.learn.part3.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(30);
		list.add("java");
		list.add(true);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------");
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("----------");
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object next = itr.next();
			System.out.println(next);
		}
	}
}
