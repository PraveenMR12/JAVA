package com.kn.artithmeticoperationchallenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		System.out.println("Main() method started");
		addition();
		subtraction();
		try {
			multiplication();
		}catch(InputMismatchException ie) {
			System.out.println("give proper input");
		}
		try {
			division();
		}catch(InputMismatchException ie){
			System.out.println("Exception handled in main");

		}catch(ArithmeticException ae) {
			System.out.println("Exception handled in main");
		}catch(Exception e) {
			System.out.println("Exception handled in main");

		}
		System.out.println("main() method ended");
	}

	private static void division() throws InputMismatchException, ArithmeticException, Exception {
		Scanner sc = new Scanner(System.in);
		int a, b;
		double result;
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			result = a * b;
			System.out.println("Dividing " + a + " / " + b + " = " + result);
		}catch(InputMismatchException ie){
			System.out.println("Exception not handled");
			throw ie;
		}catch(ArithmeticException ae) {
			System.out.println("Exception not handled");
			throw ae;
		}catch(Exception e) {
			System.out.println("Exception not handled");
			throw e;
		}
	
	}

	private static void multiplication() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		int a, b, result;
		a = sc.nextInt();
		b = sc.nextInt();
		result = a * b;
		System.out.println("Multiplying " + a + " * " + b + " = " + result);
		sc.close();
	}

	private static void subtraction() {
		Scanner sc = new Scanner(System.in);
		try {
			int a, b, result;
			a = sc.nextInt();
			b = sc.nextInt();
			result = a - b;
			System.out.println("Subtracting " + a + " - " + b + " = " + result);
		} catch (InputMismatchException ie) {
			System.out.println("Give the proper input");
			ie.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		sc.close();

	}

	private static void addition() {
		Scanner sc = new Scanner(System.in);
		int a, b, result;
		a = sc.nextInt();
		b = sc.nextInt();
		result = a + b;

		System.out.println("Adding " + a + " + " + b + " = " + result);
		sc.close();
	}

}
