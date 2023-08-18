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
//		int sum = armstrongNo(n);
//		System.out.println(sum);
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
//		System.out.println(temp2);
//		System.out.println(sum);

		if(temp2==sum) {
			System.out.println(temp2);
		}
//		System.out.println(temp+" "+count);
//		switch(count) {
//		case 1:
//			break;
//		case 2:
//			break;
//		case 3:
//			break;
//		}
	}

//	static int armstrongNo(int n) {
//		int cube, res, sum=0;
//		for()
//		while(n>0) {
//			res=n%10;
//			cube=res*res*res;
//			sum=sum+cube;
//			n=n/10;
//		}
//		return sum;
//	}
}
