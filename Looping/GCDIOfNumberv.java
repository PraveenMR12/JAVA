package com.kn.forloop;

import java.util.Scanner;

public class GCDIOfNumberv {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int n1= sc.nextInt();
		System.out.println("Enter the 2nd number");
		int n2=sc.nextInt();
		int gcd=gcdOfNum(n1,n2);
		System.out.println("GCD of number is "+gcd);
		sc.close();
	}

	static int gcdOfNum(int n1, int n2) {
		int gcd=1;
		for(int i=1; i<=n1&&i<=n2; i++) {
			if(n1%i==0&&n2%i==0) {
				gcd=i;
			}
		}
		return gcd;
		
	}
}


