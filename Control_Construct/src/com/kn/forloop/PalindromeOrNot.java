package com.kn.forloop;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int num=sc.nextInt();
		 palindrome(num);
		 sc.close();
	}

	static void palindrome(int num) {
		int n=0, temp=num;
		while(num>0){
			n=n*10+num%1;
			num=num/10;
		}
		if(temp==n) {
			System.out.println(n+" is palindrome");

		}else {
			System.out.println(n+" is not a palindrome");

		}
	}

}
