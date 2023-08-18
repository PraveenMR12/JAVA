package com.kn.arraysort;

import java.util.Scanner;

public class ArraySelectionSortingDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Array Declaration & Creation
		System.out.println("Enter the Size of Array : ");
		int[] arr=new int[sc.nextInt()];
		
		//Array Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" Element in Array : ");
			arr[i]=sc.nextInt();
		}
		
		//Class Creation
		ArraySellectionSort sort=new ArraySellectionSort();
		
		//Sorted Array Traversing
		System.out.println("Sorted Array : ");
		for(int i:sort.selectionSorting(arr)) {
			System.out.print(i+" ");
		}
		
		sc.close();
	}

} 
