package com.kn.forloop;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int num =sum(n);
		 System.out.println("sum is "+num);
		 sc.close();

		
	}

	 static int sum(int n) {
		 int result=0;
		 for(int i = 0; i<=n; i++) {
			 result=result+i;
		 }
		return result ;
	}

}
