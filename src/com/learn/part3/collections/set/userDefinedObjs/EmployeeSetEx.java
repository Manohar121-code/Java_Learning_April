package com.learn.part3.collections.set.userDefinedObjs;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSetEx {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		
		Employee e1 = new Employee(10, "Sachin", 101010);
		Employee e2 = new Employee(10, "Sachin", 86878);
		
		set.add(e1);
		set.add(e2);
		
		System.out.println(set.size());
	}
}
