package com.learn.oops.typeCasting.classCasting;

public class ClassCastingEx {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		System.out.println("----------------");
		
		Child c1 = new Child();
		c1.m1();
		c1.m2();
		System.out.println("----------------");
		
		SuperChild sc1 = new SuperChild();
		sc1.m1();
		sc1.m2();
		sc1.m3();
		System.out.println("----------------");
		
		Parent obj = new Child(); //upcasting
		obj.m1();
		System.out.println("----------------");
		
		Parent obj2 = new SuperChild();
		obj2.m1();
		System.out.println("----------------");
		
		Child ch1 = new SuperChild(); //upcasting
		ch1.m1();
		ch1.m2();
		System.out.println("----------------");
		
		if (p instanceof Child) {
			System.out.println("p is a child object");
		} else {
			System.out.println("p is not a child object");
		}
		System.out.println("----------------");
		
		if (obj instanceof Child) {
			System.out.println("obj is a child object");
		}
		System.out.println("----------------");
		
		if (obj instanceof Parent) {
			System.out.println("obj is a parent object");
		}
		System.out.println("----------------");
		
		if (ch1 instanceof SuperChild) {
			System.out.println("ch1 is a superchild object");
		}
		System.out.println("----------------");
		
		if (ch1 instanceof Child) {
			System.out.println("ch1 is a child object");
		}
		System.out.println("----------------");
		
		if (ch1 instanceof Parent) {
			System.out.println("ch1 is a parent object");
		}
		System.out.println("----------------");
		
		System.out.println("Downcasting example------------");
		if (ch1 instanceof SuperChild) {
			SuperChild superChild1 = (SuperChild) ch1;
			superChild1.m1();
			superChild1.m2();
			superChild1.m3();
		}
		System.out.println("----------------");
		
		Child chObj = (Child) obj; //downcasting
	}
}
