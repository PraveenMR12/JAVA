package com.kn.arrays;

public class SumOfTheArrayElements {
	//Method for adding the Array Elements
	public int sumOfElements(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
