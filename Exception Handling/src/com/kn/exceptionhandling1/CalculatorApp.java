package com.kn.exceptionhandling1;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator value:");
		int n = sc.nextInt();
		System.out.println("Enter the denominator value:");
		int d = sc.nextInt();
		double result = 0;
		try {
			result = n / d;
			
		}catch(ArithmeticException ae){
			System.out.println("Enter non-zero number as denominator");
		
		}
		System.out.println("Result = "+result);
		System.out.println("Thank you");
		sc.close();
	}

}
