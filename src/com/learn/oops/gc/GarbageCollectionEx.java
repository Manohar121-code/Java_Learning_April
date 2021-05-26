package com.learn.oops.gc;

import com.learn.oops.toString.Employee;

public class GarbageCollectionEx {
	public static void main(String[] args) {
		Employee obj1 = new Employee(10, "java");
		obj1 = null;
		
		Employee obj2 = new Employee(10, "Python");
		Employee obj3 = new Employee(30, "Golang");
		obj3 = obj2;
	}
}
