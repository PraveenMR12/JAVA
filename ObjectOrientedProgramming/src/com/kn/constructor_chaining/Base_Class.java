package com.kn.constructor_chaining;

public class Base_Class {
	
	int a = 10;
	String b = "aaa";
	public Base_Class() {
		this(29, "ddd");
		System.out.println("This is a Parent no arg Constructor");
	}
	public Base_Class(int a, String b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Parent 2-arg Constructor");
	}
	

}
