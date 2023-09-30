package com.kn.arrays;

import java.util.Scanner;

public class CountOfArrayEvenOrOddDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//Array Declaration & Creation
		System.out.println("Enter the size of the Array");
		int[] arr=new int[sc.nextInt()];
		
		//Array Initialization
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+"array Element: ");
			arr[i]=sc.nextInt();		
		}
		
		//Creating the Object
		CountOFSumAndOdd countOfOddSum=new CountOFSumAndOdd();
		countOfOddSum.arrayCount(arr);
		
		//closing the Scanner
		sc.close();
	}

}
