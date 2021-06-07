package com.learn.part3.collections.set.userDefinedObjs;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Sachin", 37468);
		Employee e2 = new Employee(7, "Dhoni", 87878);
		Employee e3 = new Employee(45, "Rohit", 872878);
		Employee e4 = new Employee(18, "Kohli", 89298);
		
		Map<Employee, String> map = new TreeMap<Employee, String>();
		map.put(e1, e1.getEmpName());
		map.put(e2, e2.getEmpName());
		map.put(e3, e3.getEmpName());
		map.put(e4, e4.getEmpName());
		
		Set<Employee> keySet = map.keySet();
		for (Employee e : keySet) {
			System.out.println(e);
		}
		
		System.out.println("-----------------------------");
		
		SortByName sbn = new SortByName();
		Map<Employee, String> map2 = new TreeMap<Employee, String>(sbn);
		map2.put(e1, e1.getEmpName());
		map2.put(e2, e2.getEmpName());
		map2.put(e3, e3.getEmpName());
		map2.put(e4, e4.getEmpName());
		
		Set<Employee> keys = map2.keySet();
		for (Employee e : keys) {
			System.out.println(e);
		}
	}
}
