package com.kn.forloop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum= sumOfDigits(n);
		System.out.println("sum of digits of number is "+sum);
		sc.close();
	}

	static int sumOfDigits(int n) {
		int sum=0;
		while(n>0) {
			int res=n%10;
			sum=sum+res;
			n=n/10;
		}
		return sum;
	}

}
