package com.kn.interface3;

public interface Calculator2 extends Calculator1 {
	int multiplication(int a, int b);
	int division(int a, int b);
	int i=20;
	private void m1() {
		System.out.println("private");
	}
	public default void m2() {
		m1();
	}
	

}
