package com.kn.arrays;

public class CountOFSumAndOdd {
	//Method for Counting of Sum and Odd Array Elements
	public void arrayCount(int[] arr) {
		int evenCount=0, oddCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("Count of Even number is : "+evenCount+"\nCount of Odd number is : "+ oddCount);
	}
}
