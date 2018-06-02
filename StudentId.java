package com.java;

public class StudentId {

	public void printStudent(Student student) {
		System.out.println("Print Student"+student);
	}
	public static void main(String []args) {
		
	Student student = new Student();
	student.setStudentId("15ietec013");
	student.setFirstName("Dharani");
	student.setLastName("Rajan");
	student.setGender("Female");
	student.setBranch("engineering");
	student.setDepartment("ece");
	System.out.println(student.toString());
}
}
