package com.kn.fibanocciseries;

import java.util.Scanner;

public class FibanocciSeriesDemo {

	public static void main(String[] args) {
		//Taking the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		//Creating the object for FibanocciSeries class
		FibanocciSeries fib = new FibanocciSeries();
		System.out.println(fib.fibonacci(n));
		
		
	}

}
