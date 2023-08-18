package com.kn.dowhile;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sumOfDigits(num);
		sc.close();
	}

	 static void sumOfDigits(int num) {
		 int sum=0;
		 do {
			 sum=0;
			do {
				int n=num%10;
				sum+=n;
				num=num/10;
			}while(num>0);
			num=sum;
			
		}while(sum>9);
		System.out.println(sum);
	}

}
