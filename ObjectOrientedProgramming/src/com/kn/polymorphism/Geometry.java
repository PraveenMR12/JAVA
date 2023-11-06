package com.kn.polymorphism;

public class Geometry {
	public void doActivity(Shape sh) {
		sh.draw();
		System.out.println(sh.calcArea());
	}

}
