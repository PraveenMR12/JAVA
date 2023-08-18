package com.kn.arrays;

public class Merging3Arrays {

	// Merging of arr, brr & crr array to crr
	public int[] arrayMerge(int[] arr, int[] brr, int[] crr) {
		int[] drr = new int[arr.length + brr.length + crr.length];
		// inseting arr to drr
		for (int i = 0; i < arr.length; i++) {
			drr[i] = arr[i];
		}
//			inserting brr to drr
		for (int i = 0; i < brr.length; i++) {
			drr[arr.length + i] = brr[i];
		}

		// Inserting crr to drr
		for (int i = 0; i < crr.length; i++) {
			drr[(arr.length + brr.length) + i] = crr[i];
		}

		return drr;

	}
}
