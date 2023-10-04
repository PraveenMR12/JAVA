package com.kn.constructor_chaining;

public class Derived_Class extends Base_Class {
	int a = 12;
	String b = "AAA";
	
	public Derived_Class(int a, String b) {
		this(11);
		this.a = a;
		this.b = b;
		System.out.println("2-arg Derived constructor");

	}

	public Derived_Class(int a) {
		this("ccc");
		this.a = a;
		System.out.println("int-arg Derived constructor");

	}

	public Derived_Class() {
		this(12,"bbb");
		System.out.println("no-arg Derived constructor");
	}

	public Derived_Class(String b) {
		this.b = b;
		System.out.println("string-arg Derived constructor");

	}

}
