package com.kn.interface2;

public interface Starters {
	void kabab();
	public default void enjoy() {
		System.out.println("enjoying");
		kalmi();
	}
	private void kalmi() {
		
	}
	public static void method1() {
		System.out.println("this is  a method");
	}
	

}
