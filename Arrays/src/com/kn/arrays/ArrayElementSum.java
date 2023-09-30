package com.kn.arrays;

import java.util.Scanner;

public class ArrayElementSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Declaration & Creation
		System.out.println("Enter the size of the array");
		int[] arr=new int[sc.nextInt()];
		
//		Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" term : ");
			arr[i]=sc.nextInt();
			
		}
		int sum=0;
		System.out.print("Sum of the Array Elements ");
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1) +", ");
			sum+=arr[i];
		}
		System.out.println("= "+sum);
		sc.close();
		
	}

}
