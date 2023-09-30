package com.kn.dowhile;

import java.util.Scanner;

public class DivisibleByNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Enter the range");
		int range = sc.nextInt();
		divisibleBy(n,range);
		sc.close();

	}

	static void divisibleBy(int n, int range) {
		int i=1;
		do {
			if(i%n==0) {
				System.out.println(i);
			}
			i++;
		}while(i<=range);
	}

}
