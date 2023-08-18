package com.kn.arraysort;

public class ArrayBubbleSorting {
	public int[] bubbleSorting(int[] arr) {
		for(int i=1;i<=arr.length;i++) {
			boolean isSorted=true;
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSorted=false;
				}
			}
			if(isSorted) {
				break;
			}
		}
		return arr;
	}

}
