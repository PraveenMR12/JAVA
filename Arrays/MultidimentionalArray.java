package com.kn.arrays;

import java.util.Scanner;

public class MultidimentionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Array Declaration & Creation
		System.out.println("Enter the size of the array : ");
		int[][] arr=new int[sc.nextInt()][sc.nextInt()];
		
		//Array Initialization
		for( int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
			System.out.println("enter the array element for "+(i+1)+" :");
			arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
	}

	static int countOfPositive(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				count++;
			}
		}
		return count;
	}

}
