package com.kn.arrays;

public class BinarySearch {
	
	public void isElementFound(int[] arr, int element) {
		int low=0,high=arr.length,mid=0,position=-1;
		boolean isFound=false;
		while(low<=high) {
			mid=(low+high)/2;
			if(element==arr[mid]) {
				isFound =true;
				position=mid+1;
				break;
				
			}else if(element>arr[mid]){
				low=mid+1;

			}else {
				high=mid-1;
			}
		}
		if(isFound) {
			System.out.println("Element "+element+" is Found in the "+position+" position");
		}else {
			System.out.println("Element "+element+" is not Found in the array");

		}

		
		
	}

}
