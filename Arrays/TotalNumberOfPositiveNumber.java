package com.kn.arrays;

import java.util.Scanner;

public class TotalNumberOfPositiveNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Array Declaration & Creation
		System.out.println("Enter the size of the array : ");
		int[] arr=new int[sc.nextInt()];
		
		//Array Initialization
		for( int i=0;i<arr.length;i++) {
			System.out.println("enter the array element for "+(i+1)+" :");
			arr[i]=sc.nextInt();
			
		}
		
		//Call method to find the count of positive number
		int count=countOfPositive(arr);
		System.out.println("Count of positive number is :"+ count);
		sc.close();
	}

	static int countOfPositive(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				count++;
			}
		}
		return count;
	}
	
	//creating the method for count the positive number

}
