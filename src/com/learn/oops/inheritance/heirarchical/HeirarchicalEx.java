package com.learn.oops.inheritance.heirarchical;

public class HeirarchicalEx {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.setIq(3);
		a1.setNumberOfLegs(2);
		System.out.println("Iq - "+ a1.getIq());
		System.out.println("Number of legs - "+ a1.getNumberOfLegs());
		
		System.out.println("-----------------------");
		
		Human h1 = new Human(2, 4, 6, "Male");
		System.out.println("Number of legs - "+ h1.getNumberOfLegs());
		System.out.println("IQ - "+ h1.getIq());
		System.out.println("Height - "+ h1.getHeight());
		System.out.println("Gender - "+ h1.getGender());
		
		System.out.println("-----------------------");
		
		Tiger t1 = new Tiger(true, "Bengal Tiger");
		t1.setNumberOfLegs(4);
		t1.setIq(2);
		System.out.println("Number of legs - "+ t1.getNumberOfLegs());
		System.out.println("IQ - "+ t1.getIq());
		System.out.println("Can Hunt? - "+ t1.isCanHunt());
		System.out.println("Type - "+ t1.getType());
	}
}
