package coom.learn.oops;

public class FbUser {
	int userId;
	String userName;
	int phone;
	String email;
	
	public void printFBUserData() {
		System.out.println("User Id - "+ userId);
		System.out.println("User name - "+ userName);
		System.out.println("Phone number - "+ phone);
		System.out.println("Email - "+ email);
		System.out.println("------------------------");
	}
}
