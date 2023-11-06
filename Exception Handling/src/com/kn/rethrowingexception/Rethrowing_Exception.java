package com.kn.rethrowingexception;

import java.util.Scanner;

public class Rethrowing_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc.close();
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
			multiply(a,b);
			sc.close();
		
		
	}

	static void multiply(int a, int b) {
		int product = a*b;
		System.out.println("Multiplication = "+product);
		try{
			divide(a,b);
		}catch(ArithmeticException ae) {
			System.out.println("Handled and by the caller");//its for requirement in shop if payment is failed then shopping method has to be failed
		}//so we handled here also
		
	}

	static void divide(int a, int b)throws ArithmeticException{
		// TODO Auto-generated method stub
		try{
			int division = a/b;
			System.out.println("Division = "+division);		

		}catch(ArithmeticException ae) {
			System.out.println("Exception not yet Handled and Rethrowing back to handle");
			throw ae;
			
		}
		
	}

}
