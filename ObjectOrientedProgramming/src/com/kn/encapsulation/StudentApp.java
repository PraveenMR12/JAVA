package com.kn.encapsulation;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student(1, "AAA", 55, "M");
		System.out.println("Roll Number = "+ s1.getRollNumber());
		System.out.println("Name = "+ s1.getName());
		System.out.println("Marks = "+ s1.getMarks());
		System.out.println("Gender = "+ s1.getGender());
	}

}
