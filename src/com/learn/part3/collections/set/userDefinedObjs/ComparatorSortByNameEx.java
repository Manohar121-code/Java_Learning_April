package com.learn.part3.collections.set.userDefinedObjs;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorSortByNameEx {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "Sachin", 37468);
		Employee e2 = new Employee(7, "Dhoni", 87878);
		Employee e3 = new Employee(45, "Rohit", 872878);
		Employee e4 = new Employee(18, "Kohli", 89298);
		
		SortByName sbn = new SortByName();
		
		Set<Employee> set = new TreeSet<Employee>(sbn);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		for (Employee e : set) {
			System.out.println(e);
		}
	}
}
