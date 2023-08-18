 package com.kn.forloop;

import java.util.Scanner;

public class FactorialOfNUm {
	  public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int n=factorial(num);
		System.out.println("factorial of "+num+" is :"+n);
		sc.close();
	}

	static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}


}
