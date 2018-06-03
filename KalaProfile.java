package com.personal;

public class KalaProfile implements IProfile{

	@Override
	public void myBasicInfo() {
	
		System.out.println("FirstName:kala");
		System.out.println("LastName:Dharani");
		System.out.println("Age:28");
			
	}

	@Override
	public void myHobbies() {
		System.out.println("My hobbies are reading books and learning");
			
	}
public static void main(String[]args) {
	IProfile myProfile = new KalaProfile();
	TestProfile.printProfile(myProfile);
}
}
