package com.personal;

public class DharaniProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+" Dharani");
		System.out.println(ProfileConstants.LAST_NAME+ " Dharani");
		System.out.println("Age:28");
		
	}

	@Override
	public void myHobbies() {
		System.out.println("My hobbies are reading books and learning");
		
	}

}
