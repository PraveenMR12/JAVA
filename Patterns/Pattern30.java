package com.kn.pattern;

public class Pattern30 {

	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=5;i++) {
			if(i<=3) 
				k++;
			else
				k--;
			for(int j=1;j<=5;j++) {
				if(j==k||j==6-k) 
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
	}
