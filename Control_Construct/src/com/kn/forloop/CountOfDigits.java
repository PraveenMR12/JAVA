package com.kn.forloop;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		countDigits(n);
		sc.close();
	}
	
	 static void countDigits(int n) {
			int count=0,temp=n;
			 while(n>0) {
				n=n/10;
				count++;
			}
			 System.out.println("Number of digits in "+temp+" is "+count);
	 }
}
