package com.kn.gcdofnumber;

import java.util.Scanner;

public class GCDOfNumberDemo {

	public static void main(String[] args) {
		//Taking the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2st number : ");
		int n2 = sc.nextInt();
		
		//Creating the object for GCDOfNumber
		GCDOfNumber gcd = new GCDOfNumber();
		System.out.println(10%15);
		
		//calling the method for GCD and printing the value
		System.out.println("GCD of "+n1+" & "+n2+" = "+ gcd.gcdOfNum(n1,n2));
		
		//Releasing the resources
		sc.close();

	}

}
