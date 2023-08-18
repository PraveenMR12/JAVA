package com.kn.dowhile;

import java.util.Scanner;

public class AverageOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range = sc.nextInt();
		numberAverage(range);
		sc.close();

	}

	static void numberAverage(int range) {
		int i=1,sum=0,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		do {
			int num=sc.nextInt();
			sum+=num;
			i++;
		}while(i<=range);
		avg=sum/range;
		System.out.println("Avg of the numbers is = "+avg);
		sc.close();

	}
	

}
