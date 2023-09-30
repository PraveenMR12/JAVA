package com.kn.forloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			armStrong(i);
		}
		sc.close();
	}

	 static void armStrong(int n) {
		int count=0,temp=n,temp2=n,sum=0;
		int m;
		 while(n>0) {
			n=n/10;
			count++;
		}
		while(temp>0) {
			m=temp%10;
			int mul=1;
			for(int i=1;i<=count;i++) {
				mul*=m;
			}
			sum+=mul;
			temp=temp/10;
			
		}

		if(temp2==sum) {
			System.out.println(temp2);
		}
	}
}
