
package com.kn.arrays;

import java.util.Scanner;

public class ArrayBy3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Declaration & Creation
		System.out.println("Enter the size of the array");
		int[] arr=new int[sc.nextInt()];
		
//		Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" term : ");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("The Number which are divisible by 3 are follows : ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}

}
