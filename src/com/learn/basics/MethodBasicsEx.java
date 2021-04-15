package com.learn.basics;

public class MethodBasicsEx {
	
//	<access_modifier> <static_nonstatic> <return_type> <identifier/method_name>(arguments) {
//	
//}
	public static void main(String[] args) {
		System.out.println("Main started");
		System.out.println("---------------------");
		
		test();
		
		System.out.println("---------------------");
		
		int returnedValue = testWithIntReturn();
		System.out.println("Returned value - "+ returnedValue);
		
		System.out.println("---------------------");
		
		boolean b = testWithBooleanReturn();
		System.out.println("Returned boolean vaule - "+b);
		
		System.out.println("---------------------");
		
		int k = 50;
		testWithArguments(k);
		
		System.out.println("---------------------");
		
		int i = 45;
		String s = "java";
		String result = testWithArgumentsAndReturnType(i, s);
		System.out.println("returned value - "+ result);
		
		System.out.println("---------------------");
		
		int sumValue = sum(10, 20);
		System.out.println("Sum value - "+ sumValue);
		
		System.out.println("---------------------");
		System.out.println("Main ended");
	}

	public static void test() {
		System.out.println("test method called");
		System.out.println("test method ended");
	}
	
	public static int testWithIntReturn() {
		int i = 10;
		System.out.println("i value - "+ i);
		return i;
	}
	
	public static boolean testWithBooleanReturn() {
		System.out.println("testWithBooleanReturn method called");
		boolean b = true;
		return b;
	}
	
	public static void testWithArguments(int i) {
		System.out.println("testWithArguments(int i) method called");
		System.out.println("input i - "+ i);
	}
	
	public static String testWithArgumentsAndReturnType(int i, String s) {
		System.out.println("testWithArgumentsAndReturnType(int i, String s) method is called");
		System.out.println("i value - "+ i);
		System.out.println("s value - "+ s);
		String res = s + i;
		return res;
	}
	
	public static int sum(int i, int j) {
		System.out.println("sum() is called");
		int sum = i + j;
		return sum;
	}

}
