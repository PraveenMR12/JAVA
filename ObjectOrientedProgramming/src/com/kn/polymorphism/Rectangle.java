package com.kn.polymorphism;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

	@Override
	public double calcArea() {
		int l = 10;
		int b = 5;
		return l*b;
		
	}

}
