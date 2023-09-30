package com.kn.array3d;

import java.util.Scanner;

public class Array3DArray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Array Declaration
		int arr[][][];
		
		
		//Array Creation
		arr=new int[4][][];
		arr[0]=new int[3][];
		arr[0][0]=new int[2];
		arr[0][1]=new int[4];
		arr[0][2]=new int[1];

		arr[1]=new int[2][3];
		
		arr[2]=new int[2][];
		arr[2][0]=new int[2];
		arr[2][1]=new int[1];
		
		arr[3]=new int[3][2];
		
		
		
		//Array Initialization
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the data to be stored in Array Element "+(i+1)+", "+(j+1)+", "+(k+1));
					arr[i][j][k]=sc.nextInt();
					
				}
			}
		}
		
		
		//Array Traversing
		System.out.println("Data in Array's are");
		for(int i=0; i<arr.length;i++) {
			System.out.println("------Data of 1D Array------");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("------Data of 2D Array-----");
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(arr[i][j][k]);
					
				}
			}
		}
		sc.close();
	}

}
