package com.kn.interface1;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new CSE_Student();
		Student s2 = new MechStudent();
		StudentDemo.callMethod(s1);
		System.out.println("---------------------------");
		callMethod(s2);
	}

	static void callMethod(Student s) {
		s.study();
		s.doProject();
	
		
	}

}
