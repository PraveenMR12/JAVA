package com.kn.array2d;

import java.util.Scanner;

public class DuplicateNumber1DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		//Array Creation
		int[] arr=new int[size];
		
		
//		Array Initialization
		System.out.println("Enter the array element : ");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		findingRepeatedElements(arr);
		sc.close();
	}

	static void findingRepeatedElements(int[] arr) {
		int a=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					a=arr[j];
					break;
				
				}
		
			}
		}
		System.out.println("Duplicate Number is : "+a);
	}

}
