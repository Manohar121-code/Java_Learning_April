package com.learn.oops.encapsulation.singletonClass;

public class Sample {
	
	private static Sample obj;

	private Sample() {
		
	}
	
	public static Sample getInstance() {
		if (obj == null) {
			obj = new Sample();
		}
		return obj;
	}
	
}
