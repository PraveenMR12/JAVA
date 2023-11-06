package com.kn.interface2;

public class MealDemo {

	public static void main(String[] args) {
		Meal m = new Meal();
		callMethods(m);
	}

	static void callMethods(Meal m) {
		m.Biryani();
		System.out.println("------------------------------");
		m.kabab();
		System.out.println("------------------------------");
		m.iceCream();
		System.out.println("------------------------------");
		m.enjoy();
		System.out.println("------------------------------");

	}

}
