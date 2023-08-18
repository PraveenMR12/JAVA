package com.kn.forloop;

import java.util.Scanner;

public class Nprimen {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=scan.nextInt();
		primeNumber(a);
		scan.close();
		
		
	}

	static void primeNumber(int a) {
		int i=0;
		int x=2;
		while(i<a) {
			
				boolean isPrime=true;
				for(int j=2;j<x;j++)
				{
					if(x%j==0) {
						isPrime=false;
						break;
					}
				}
				if(isPrime) {
					System.out.println(x);
					i++;
				}
				x++;
		}
		
		
	}
}
