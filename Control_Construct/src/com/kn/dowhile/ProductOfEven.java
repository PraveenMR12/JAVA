package com.kn.dowhile;

import java.util.Scanner;

public class ProductOfEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		productOfEven(n);
		sc.close();
	}

	 static void productOfEven(int n) {
		 int i=1,product=1;
		 do {
			int even=i*2;
			product*=even;
			i++;
		}while(i<=n);
		 System.out.println("product of first "+ n+" is ="+product);
	}

}
