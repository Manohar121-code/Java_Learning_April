package com.learn.oops.setterAndGetter;

public class InstaUserMainEx {
	public static void main(String[] args) {
		InstaUser obj1 = new InstaUser();
		obj1.setUserId("_xyz");
		obj1.setUserName("xyz abc");
		obj1.setAge(22);
		
		
		String userId = obj1.getUserId();
		String userName = obj1.getUserName();
		int age = obj1.getAge();
		
		System.out.println("User Id - "+ userId);
		System.out.println("User name - "+ userName);
		System.out.println("Age - "+ age);
		
		System.out.println("------------------------");
		System.out.println("After 1 year");
		obj1.setAge(23);
		
		System.out.println("Age - "+ obj1.getAge());
	}
}
