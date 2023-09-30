package com.kn.forloop;

import java.util.Scanner;

public class LargestPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		largestPalindrome(n);
		sc.close();
	}

	static void largestPalindrome(int n) {
		int i=n;
		while(i>0) {
			if(isPalindrome(i)) {
				System.out.println(i+" is a largest palindrome");
				break;
			}
			i--;
		}
	}
	public static boolean isPalindrome(int n) {
		int digit=0, temp=n;
		while(n>0) {
			digit=digit*10+n%10;
			n=n/10;	
		}
//		System.out.println(digit);
		if(digit==temp) {
			return true;
		}else {
			return false;
		}
	}

}
