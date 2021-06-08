package com.learn.part3.exceptionHandling;

import com.learn.part3.collections.set.userDefinedObjs.Employee;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		Employee obj = null;
		if (obj != null) {
			int empId = obj.getEmpId();
			System.out.println(empId);
		} else {
			System.out.println("obj is provided as null, please check it");
		}
		
		System.out.println("Main ended");
	}
}
