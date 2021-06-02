package com.learn.part3.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add("abc");
		
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
		
		list.addFirst("Java");
		
		printElementsInList(list);
		
		list.addLast("Python");
		
		printElementsInList(list);
		
		list.removeFirst();
		
		printElementsInList(list);
		
		list.removeLast();
		
		printElementsInList(list);
		
		LinkedList l2 = new LinkedList();
		l2.add(15);
		l2.add(30);
		
		list.addAll(l2);
		printElementsInList(list);
		
		list.removeAll(l2);
		printElementsInList(list);
	}
	
	public static void printElementsInList(List list) {
		System.out.println("----------");
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
