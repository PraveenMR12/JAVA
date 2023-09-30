package com.kn.forloop;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int num=sc.nextInt();
		 prime(num);
//		boolean isPrime= prime1(num);
//		if(isPrime) {
//			System.out.println(num+" is prime Number");
//		}else {
//			System.out.println(num+" is not a prime Number");
//
//		}
		sc.close();
	}

//	boolean approach
//	static boolean prime1(int num) {
//		boolean isPrime=true;
//		for(int i=2;i<num; i++){
//			if(num%i==0) {
//				isPrime=false;
//				break;
//			}
//		}
//		return isPrime;
//	}

	
//	count approach
	static void prime(int num) {
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num+" is prime Number");
		}else {
			System.out.println(num+" is not a prime Number");

		}
	}

}
