package com.kn.forloop;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number");
		int n1= sc.nextInt();
		System.out.println("Enter the Exponent number");
		int n2=sc.nextInt();
		int power=powerOfNumber(n1,n2);
		System.out.println(n1+"power of "+n2+" is "+power);
		sc.close();
	}

	 static int powerOfNumber(int n1, int n2) {
		int power=1;
		 for(int i=1; i<=n2; i++) {
			power*=n1;
		}
		 
		 return power;
	}

}
