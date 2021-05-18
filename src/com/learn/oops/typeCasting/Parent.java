package com.learn.oops.typeCasting;

public class Parent {
	private int parentId;
	private String parentName;

	public Parent() {
		super();
	}

	public Parent(int parentId, String parentName) {
		super();
		this.parentId = parentId;
		this.parentName = parentName;
	}
	
	public void test() {
		System.out.println("Parent class test() called");
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

}
