package com.learn.oops;

public class FbUserObjectEx {
	public static void main(String[] args) {
		FbUser deva = new FbUser();
		deva.userId = 1;
		deva.userName = "Deva";
		deva.phone = 76576;
		deva.email = "deva@gmail.com";
		deva.printFBUserData();
		
		FbUser suresh = new FbUser();
		suresh.userId = 2;
		suresh.userName = "Suresh";
		suresh.phone = 73639;
		suresh.email = "suresh@gmail.com";
		suresh.printFBUserData();
	}
}
