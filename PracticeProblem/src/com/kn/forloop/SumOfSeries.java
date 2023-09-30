package com.kn.forloop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		series(n);
		sc.close();
	}

	static void series(int n) {
		double i=1;
		double sum=0;
		while(i<=n) {
			sum=sum+1/i;
			i++;
		}
		System.out.println("sum ="+sum);
		
	}

}