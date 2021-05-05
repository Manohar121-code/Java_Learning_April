package com.learn.oops.constructor;

public class ConstructorEmpMainEx {
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.setEmpId(1);
		obj1.setEmpName("xyz");
		obj1.setSalary(765765);
		
		System.out.println("---------------------");
		
		Employee obj2 = new Employee(2, "abc", 76576);
		String empName = obj2.getEmpName();
		System.out.println("Employee Name - "+ empName);
		
		obj2.setEmpName("jkl");
		String empNameUpdated = obj2.getEmpName();
		System.out.println("Employee Name - "+ empNameUpdated);
	}
}
