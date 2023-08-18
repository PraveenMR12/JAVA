package com.kn.dowhile;

import java.util.Scanner;

public class ProductOfOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		oddNumber1(num);
		sc.close();
	}

	static void oddNumber(int num) {
		int i=num,mul=1;
		do {
			int odd=2*i-1;
			mul*=odd;
			i--;
		}while(i>0);
		System.out.println(mul);
	}
	
	static void oddNumber1(int num) {
		int mul=1;
		int x=1;
		while(num>0) {
			if(x%2==1) {
				mul=mul*x;
//				System.out.println(x);
				num--;
			}
			x++;
			
			
		}
		System.out.println(mul);
	}

}
