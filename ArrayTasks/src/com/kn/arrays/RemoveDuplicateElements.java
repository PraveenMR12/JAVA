package com.kn.arrays;


public class RemoveDuplicateElements {

	public int[] removeDuplicates(int[] arr) {
		int count=arr.length;
		for(int i=0 ; i<arr.length;i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j] && arr[i]!=0) {
					arr[j]=0;
					count--;
				}
			}
		}
		int[] brr= new int[count];
		for(int i=0,j=0 ; i<arr.length; i++) {
			if (arr[i]!=0) {
				brr[j]=arr[i];
				j++;
			}
		}
		
		return brr;

	}

}
