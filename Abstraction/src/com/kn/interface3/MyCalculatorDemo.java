package com.kn.interface3;

public class MyCalculatorDemo {

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		callMethod(calc);
	}

	private static void callMethod(Calculator2 calc) {
		System.out.println(calc.addition(5, 4));
		System.out.println(calc.subtraction(5, 4));
		System.out.println(calc.multiplication(5, 4));
		System.out.println(calc.division(5, 4));
		
	}

}
