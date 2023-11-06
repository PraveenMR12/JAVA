package com.kn.arraysort;

public class ArrayInsertionSort {
	
	//method for Insertion sort
	public int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int temp=arr[i+1];
			int j=i;
			while (j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
		return arr;
	}

}
