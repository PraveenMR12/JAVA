package com.kn.encapsulation;

public class Student {
	private int rollNumber;
	private String name;
	private int Marks;
	private String gender;
	public Student(int rollNumber, String name, int marks, String gender) {
		this.rollNumber = rollNumber;
		this.name = name;
		Marks = marks;
		this.gender = gender;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
