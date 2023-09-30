package com.kn.arrays;

import java.util.Scanner;

public class MergingOfArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//Array Declaration & Creation
		System.out.println("Enter the size of the Array arr");
		int a=sc.nextInt();
		System.out.println("Enter the size of the Array arr");
		int b=sc.nextInt();

		int[] arr=new int[a];
		int[] brr=new int[b];
		
		//Array Initialization of arr
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" arr array Element: ");
			arr[i]=sc.nextInt();		
		}
		
		//Array Initialization of arr

		for(int i=0; i<brr.length;i++) {
			System.out.println("Enter the "+(i+1)+" brr array Element: ");
			brr[i]=sc.nextInt();		
		}
		
		
		//Creating the Object
		MergingOfArray mergeArray=new MergingOfArray();
		int[] crr=mergeArray.arrayMerge(arr, brr);
		
		
		System.out.println(" Elements in the crr is :");
		//Traversing of crr
		for(int i=0; i<crr.length;i++) {
			
			System.out.println(crr[i]);
		}
		
		//closing the Scanner
		sc.close();
	}

}
