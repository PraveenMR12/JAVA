package com.kn.forloop;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		largest(n);
		sc.close();
	}

	 static void largest(int n) {
		int digit,temp=0;
		 while(n>0) {
			digit=n%10;
			
			if(digit>temp) {
				temp=digit;
			}
			n=n/10;
		}
		 System.out.println(temp);
	}

}
