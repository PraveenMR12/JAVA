package com.kn.whileloop;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		pattern2(num);
		sc.close();

	}

	static void pattern1(int num) {
		int i=1;
		while(i<=num){
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i=i+2;
		}
	}
	static void pattern2(int num) {
		int i=1;
		while(i<=num){
			int j=1;
			while(j<=num) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i=i+2;
		}
	}

}
