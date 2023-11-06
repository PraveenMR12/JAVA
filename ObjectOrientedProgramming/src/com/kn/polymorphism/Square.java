package com.kn.polymorphism;

public class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}

	@Override
	public double calcArea() {
		int side = 10;
		return side*side;
	}

}
