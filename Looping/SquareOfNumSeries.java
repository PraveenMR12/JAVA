package com.kn.whileloop;

import java.util.Scanner;

public class SquareOfNumSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sumOfSquareNumber(num);
		sc.close();
	}

	static void sumOfSquareNumber(int num) {
		int i=1,sum=0,res=0;
		for(i=1;i<=num;i++) {
			res=i*i;
			sum=sum+res;
		}
		System.out.println(sum);
	}

}
