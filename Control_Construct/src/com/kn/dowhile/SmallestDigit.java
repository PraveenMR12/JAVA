package com.kn.dowhile;

import java.util.Scanner;

public class SmallestDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		smallestDigit(num);
		sc.close();
	}

	static void smallestDigit(int num) {
		int temp=9;
		do {
			int dig=num%10;
			if(dig<=temp) {
				temp=dig;
			}
			num=num/10;
		}while(num>0);
		System.out.println(temp);
	}

}
