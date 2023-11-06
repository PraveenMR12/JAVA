package com.kn.exceptioninmethods;

import java.util.Scanner;

public class Exception_Methods_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc.close();
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		try{
			multiply(a,b);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
	}

	static void multiply(int a, int b) {
		int product = a*b;
		System.out.println("Multiplication = "+product);
		divide(a,b);
		
	}

	static void divide(int a, int b){
		// TODO Auto-generated method stub
		int division = a/b;
		System.out.println("Division = "+division);		
	}

}
