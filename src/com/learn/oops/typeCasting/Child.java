package com.learn.oops.typeCasting;

public class Child extends Parent {
	private int childId;
	private String childName;

	public Child() {
		super();
	}

	public Child(int childId, String childName) {
		super();
		this.childId = childId;
		this.childName = childName;
	}
	
	public void test() {
		System.out.println("Child class test() called");
	}

	public int getChildId() {
		return childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

}
