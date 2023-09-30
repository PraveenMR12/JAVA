package com.kn.arraysort;

import java.util.Scanner;

public class ArrayBubbleSortingDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" Element in Array : ");
			arr[i]=sc.nextInt();
		}
		ArrayBubbleSorting sort=new ArrayBubbleSorting();
		System.out.println("Sorted Array : ");
		int[] brr=sort.bubbleSorting(arr);
		
		for(int i=0;i<brr.length;i++) {
			
			System.out.print(brr[i]+" ");
		}
		
		sc.close();
	}

}
