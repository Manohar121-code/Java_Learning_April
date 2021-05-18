package com.learn.oops.typeCasting;

public class ClassCastingEx {
	public static void main(String[] args) {
		
		Parent obj = new Child(); //up casting
		obj.test();
		
//		Child obj2 = new Parent(); //this is not possible because Parent object won't contains Child class properties
		
		Child childObj = (Child) obj; //down casting
		
		
		if (obj instanceof Child) {
			Child obj2 = (Child) obj;
			System.out.println("Casted to child successfully");
		}
	}
}
