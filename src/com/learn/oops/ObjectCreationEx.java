package com.learn.oops;

public class ObjectCreationEx {
	int id;
	String name;
	
	public void m1() {
		System.out.println("m1() called");
	}

	public static void main(String[] args) {
//		Object creation Syntax
//		<classType> <identifier> = new <classType>();
		ObjectCreationEx obj1 = new ObjectCreationEx();
		obj1.id = 10;
		obj1.name = "java";
		System.out.println(obj1.id);
		System.out.println(obj1.name);
		obj1.m1();
		
		System.out.println("---------------------------");
		
		ObjectCreationEx obj2 = new ObjectCreationEx();
		obj2.id = 20;
		obj2.name = "python";
		System.out.println(obj2.id);
		System.out.println(obj2.name);
		obj2.m1();

		System.out.println("---------------------------");
		
		ObjectCreationEx obj3 = new ObjectCreationEx();
		obj3.id = 30;
		obj3.name = "Go lang";
		System.out.println(obj3.id);
		System.out.println(obj3.name);
		obj3.m1();
	}
}
