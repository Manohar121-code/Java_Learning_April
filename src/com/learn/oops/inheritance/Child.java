package com.learn.oops.inheritance;

public class Child extends Parent {
	private int age;
	private String city;

	public Child() {

	}

	public Child(int age, String city) {
		super();
		this.age = age;
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
