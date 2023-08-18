package com.kn.arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Declaration & Creation
		System.out.println("Enter the size of the array");
		String[] arr=new String[sc.nextInt()];
		
//		Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" term : ");
			arr[i]=sc.next();
			
		}
		
		
		System.out.println("Elements in the Arrays are : ");
//		Travering
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
