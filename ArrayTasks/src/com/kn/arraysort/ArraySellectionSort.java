package com.kn.arraysort;

public class ArraySellectionSort {
	
	//Method for Selection Sorting
	public int[] selectionSorting(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int index=i;
			
			for(int j=i+1;j<arr.length-1;j++) {
				if(min>arr[j]) {
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[index]=temp;
		}
		return arr;
	}

}
