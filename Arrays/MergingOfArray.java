package com.kn.arrays;

public class MergingOfArray {
	
	//Merging of arr & brr array to crr
	public int[] arrayMerge(int[] arr, int[] brr){
		int [] crr=new int[arr.length+brr.length];
		//inseting arr to crr
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i];
		}
//		inserting brr to crr
		for(int i=0;i<brr.length;i++) {
			crr[arr.length+i]=brr[i];
		}
		
		return crr;
		
	}

}
