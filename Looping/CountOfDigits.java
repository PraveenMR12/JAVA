package com.kn.dowhile;

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
			 do{
				n=n/10;
				count++;
			}while(n>0);
			 System.out.println("Number of digits in "+temp+" is "+count);
	 }
}