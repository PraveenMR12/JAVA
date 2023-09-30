package com.kn.factorial;

import java.util.Scanner;

public class FactorialOfNumberDemo {

	public static void main(String[] args) {
		//Taking the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int input = sc.nextInt();
		
		//Creating the object for FactorialOfNumber
		FactorialOfNumber fact =new FactorialOfNumber();
		
		//calling the method for factorial and printing the value
		System.out.println("Factorial of "+input+" = "+ fact.factorial(input));
		
		//Releasing the resources
		sc.close();
		

	}

}
