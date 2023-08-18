package com.kn.forloop;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		productOfDigits(n);
		sc.close();
	}

	static void productOfDigits(int n) {
		int mul=1,digit;
		while(n>0) {
			digit=n%10;
			mul*=digit;
			n=n/10;
		}
		System.out.println("The product is "+mul);
	}

}
