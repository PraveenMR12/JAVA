package com.kn.forloop;

import java.util.Scanner;

public class EvenNumbers1ToN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		evenNum(n);
		sc.close();
	}

	 static void evenNum(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
