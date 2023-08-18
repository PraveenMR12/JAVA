package com.kn.array2d;

import java.util.Scanner;

public class AddAndMultiply2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the 2D arrays --> a&b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//Array Declaration & Array Creation
		int[][] arr=new int[a][b];
		int[][] brr=new int[a][b];
		int[][] crr=new int[a][b];
		 
		//Array Initialization
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.println("Enter the data for 1st Array in "+(i+1)+" row "+(j+1)+" column");
				arr[i][j]=sc.nextInt();
	
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.println("Enter the data for 2nd Array in "+(i+1)+" row "+(j+1)+" column");
				brr[i][j]=sc.nextInt();
	
			}
		}
		
//		Array Addition
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				
				crr[i][j]=arr[i][j]+brr[i][j];
	
			}
		}
		
//		Array Traversing
		for(int i=0;i<a;i++) {
			System.out.println("Elements in Crr in "+(i+1)+" row is : ");
			for(int j=0;j<b;j++) {
				
				System.out.println(crr[i][j]);
	
			}
		}
		sc.close();
	}

}
