package com.kn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElementsDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Array Declaration & Creation
		System.out.println("Enter the size of the Array");
		int[] arr=new int[sc.nextInt()];
		
		//array Initialization
		for(int i=0 ; i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" Element in the Array");
			arr[i]=sc.nextInt();
			
		}
		
		RemoveDuplicateElements duplicateElementRemove = new RemoveDuplicateElements();
		
		System.out.println("The new Array without Duplicate Elements "+Arrays.toString(duplicateElementRemove.removeDuplicates(arr)));
		
		
	}

}
