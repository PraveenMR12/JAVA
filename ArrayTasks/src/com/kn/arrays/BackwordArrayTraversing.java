package com.kn.arrays;

public class BackwordArrayTraversing {
	//method for backward Array Traversing
	public void printArrayInBackwords(int[] arr) {
		System.out.println("\n*****Elements in the array in Backwards*****");
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
