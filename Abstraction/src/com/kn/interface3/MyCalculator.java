package com.kn.interface3;
//functional interface: is a interface which has only one abstract method
//Marker Interface: Empty Interface ex: Serializable, Cloneable, Remote
//Lambda expression, arrow function
public class MyCalculator extends Object implements Calculator2 {

	@Override
	public int multiplication(int a, int b) {
		return a*b;

	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;

	}

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;

	}

	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;

	}

}
