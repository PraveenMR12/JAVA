package com.kn.forloop;

import java.util.Scanner;

public class SumOfSquareNumber {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Sum of "+n+" Square Number is "+squareSequance(n));
		sc.close();
	}

	static int squareSequance(int n) {
		int sum=0;
		for(int i=1; i<=n;i++) {
			int sqr=i*i;
			sum+=sqr;
		}
		return sum;
	}

}
