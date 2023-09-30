package com.kn.forloop;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sumOfOddNum(n);
		sc.close();
	}

	static void sumOfOddNum(int n) {
		int odd,sum=0;
		for(int i=1;i<=n;i++) {
			odd=i*2-1;
			sum+=odd;
		}
		System.out.println("sum is "+sum);
	}

}
