package com.kn.pattern;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=0;
		for(int i=1;i<=9;i++) {
			if(i<=5) 
				k++;
			else
				k--;
			for(int j=1;j<=5;j++) {
				if(j<=k) 
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
		int n=sc.nextInt();
		int l=0;
		for(int i=1; i<=n+n-1; i++) {
			if(i<=n) {
				l++;
			}else {
				l--;
			}
			for(int j=1; j<=n; j++) {
				if(j==n || j==n+1-l) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
