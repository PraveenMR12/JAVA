package com.kn.polymorphism;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public double calcArea() {
		int r = 10;
		return Math.PI*r*r;
	}

}
