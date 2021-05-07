package com.learn.oops.inheritance;

public class InheritanceBasicEx {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.setId(1);
		c1.setName("Govardhan");
		c1.setAge(27);
		c1.setCity("Bangalore");
		
		System.out.println("Id - "+ c1.getId());
		System.out.println("Name - "+ c1.getName());
		System.out.println("Age - "+ c1.getAge());
		System.out.println("City - "+ c1.getCity());
	}
}
