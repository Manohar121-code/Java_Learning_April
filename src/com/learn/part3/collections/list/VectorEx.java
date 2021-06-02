package com.learn.part3.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		List list = new Vector<>();
		
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
		
		System.out.println("---------------------");
		System.out.println("Before adding element, the size - "+list.size());
		list.add("python");
		System.out.println("After adding element, the size - "+list.size());
		printElementsInList(list);
		
		list.add(1, "inFirstIndex");
		printElementsInList(list);
		
		System.out.println("-----------");
//		list.clear();
//		System.out.println("size - "+ list.size());
		
		boolean contains = list.contains(25);
		System.out.println(contains);
		
		System.out.println("----------");
		
		int indexOf = list.indexOf("inFirstIndex");
		System.out.println(indexOf);
		
		System.out.println("----------");
		
//		list.clear();
		String isEmpty = list.isEmpty() ? "list is empty" : "list is not empty";
		System.out.println(isEmpty);
		
		System.out.println("-----------");
		
		list.remove(1);
		printElementsInList(list);
		
		list.remove(true);
		
		printElementsInList(list);
		
		list.add(2, 4);
		
		printElementsInList(list);
		
		int k = 4;
		Integer intObj = new Integer(k);
		list.remove(intObj);
		
		printElementsInList(list);
		
		System.out.println("------------");
		
		list.set(3, "Golang");
		
		printElementsInList(list);
	}
	
	public static void printElementsInList(List list) {
		System.out.println("----------");
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
