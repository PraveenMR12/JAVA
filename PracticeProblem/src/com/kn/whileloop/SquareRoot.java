package com.kn.whileloop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		squareRoot(n);
		sc.close();
	}

	static void squareRoot(int n) {
		int root=(int)Math.sqrt(n);
		System.out.println("Square of "+n+" is "+root);
	}

}
