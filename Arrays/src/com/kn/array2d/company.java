package com.kn.array2d;

import java.util.Scanner;

public class company {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of companies");
		
//		Array declaration and Creation
		String[][] arr=new String[sc.nextInt()][];
		
//		per company models
		for(int i=0;i<arr.length;i++) {
			System.out.print("\nHow Many Models You Want To In "+(i+1)+" Company --> ");
			arr[i]=new String[sc.nextInt()];			
		}
		String[] companyName = new String[arr.length];
		
//		array initialization 
		for(int i=0;i<arr.length;i++) {
			System.out.print("\nEnter "+(i+1)+ " Company Name --> ");
			companyName[i]=sc.next();
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("\nEnter Models "+(j+1)+" in "+companyName[i]+" Company --> ");
				arr[i][j]=sc.next();
			}
		}
//		array traversing
		System.out.println("Details");
		for(int i=0;i<arr.length;i++) {
			System.out.println(companyName[i]+" Company Has "+arr[i].length+" Models");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Model "+(j+1)+" --> "+arr[i][j]);
			}
		}
		sc.close();
		
	}
}
