package com.kn.forloop;

import java.util.Scanner;

public class ReverseOfNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		reverse(n);
		sc.close();
	}

	static void reverse(int n) {
		while(n>0) {
			int res=n%10;
			System.out.print(res);
			n=n/10;
		}
	}

}
