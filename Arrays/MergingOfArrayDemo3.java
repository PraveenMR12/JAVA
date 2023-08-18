package com.kn.arrays;

import java.util.Scanner;

public class MergingOfArrayDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//Array Declaration & Creation
		System.out.println("Enter the size of the Array arr");
		int a=sc.nextInt();
		System.out.println("Enter the size of the Array brr");
		int b=sc.nextInt();
		System.out.println("Enter the size of the Array crr");
		int c=sc.nextInt();
		

		int[] arr=new int[a];
		int[] brr=new int[b];
		int[] crr = new int[c];
		
		//Array Initialization of arr
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" arr array Element: ");
			arr[i]=sc.nextInt();		
		}
		//Array Initialization of brr
		for(int i=0; i<brr.length;i++) {
			System.out.println("Enter the "+(i+1)+" arr array Element: ");
			brr[i]=sc.nextInt();		
		}
		//Array Initialization of crr
		for(int i=0; i<crr.length;i++) {
			System.out.println("Enter the "+(i+1)+" arr array Element: ");
			crr[i]=sc.nextInt();		
		}
		
		Merging3Arrays merge=new Merging3Arrays();
		int[] drr=merge.arrayMerge(arr, brr, crr);
		
		
		//Traversing of drr
		System.out.println("Elements in the drr Array");
		for(int i=0; i<drr.length;i++) {
			System.out.print(drr[i]+" ");
		}
		
		//Closing of scan
		sc.close();
		
	}

}
