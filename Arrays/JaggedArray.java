package com.kn.arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Array Declaration & Creation
		System.out.println("Enter the Total Batch : ");
		String[][] arr=new String[sc.nextInt()][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the total number of friends in "+(i+1)+" Batch");
			arr[i]=new String[sc.nextInt()];
		}

		
		//Array Initialization
			for(int i=0;i<arr.length;i++) {
				System.out.println("A"+(i+1)+" Batch Data");
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the  "+(j+1)+" Friend");
					arr[i][j]=sc.next();
				}
			}
			//Array Traversing
					for(int i=0;i<arr.length;i++) {
						System.out.println("-----Batch "+(i+1)+" Friends-----");
						for(int j=0;j<arr[i].length;j++) {
							System.out.println("\t"+arr[i][j]);
						}
					}
		sc.close();

	}

}
