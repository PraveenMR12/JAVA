package com.kn.arrays;

import java.util.Scanner;

public class ArrayEven {

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
		System.out.println("The Even Number as follows : ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}

}
