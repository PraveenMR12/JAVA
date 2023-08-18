package com.kn.arrays;

import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//Array Declaration & Creation
		System.out.println("Enter the size of the Array");
		int[] arr=new int[sc.nextInt()];
		
		//Array Initialization
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter the " +(i+1)+" array data: ");
			arr[i]=sc.nextInt();		
			}
		//Entering the element to search
		System.out.println("Enter the Element to Search :");
		int element =sc.nextInt();
		
		//Creating the Object
		BinarySearch binarySearch=new BinarySearch();
		binarySearch.isElementFound(arr, element);
		
		sc.close();
	}

}
