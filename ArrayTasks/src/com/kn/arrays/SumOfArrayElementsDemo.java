package com.kn.arrays;

import java.util.Scanner;

public class SumOfArrayElementsDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//Array Declaration & Creation
		System.out.println("Enter the size of the Array");
		int[] arr=new int[sc.nextInt()];
		
		//Array Initialization
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter the array data in " +(i+1)+" position: ");
			arr[i]=sc.nextInt();		
		}
		
		//Creating the Object
		SumOfTheArrayElements sumofElements=new SumOfTheArrayElements();
		System.out.println("Sum of the Array Elements is : "+ sumofElements.sumOfElements(arr));
		
		//closing the Scanner
		sc.close();
	}

}
