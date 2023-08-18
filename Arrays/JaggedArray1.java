package com.kn.arrays;

import java.util.Scanner;

public class JaggedArray1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Array Declaration & Creation
		int[][] arr=new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		
		//Array Initialization
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the "+(i+1)+" array "+(j+1)+" Data");
				arr[i][j]=sc.nextInt();
			}
		}
		//Array Traversing
				for(int i=0;i<arr.length;i++) {
					System.out.println("-----element in"+(i+1)+" array-----");
					for(int j=0;j<arr[i].length;j++) {
						System.out.println(arr[i][j]);
					}
				}
				sc.close();
		
	}

}
