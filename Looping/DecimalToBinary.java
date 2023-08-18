package com.kn.dowhile;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		toBinary1(num);
		sc.close();

		
	}

	static void toBinary(int num) {
		int bin=0;
		do {
			if(num%2==0) {
				bin=bin*10;
			}else {
				bin=bin*10+1;
			}
			num=num/2;
		}while(num>0);
		System.out.println(bin);
	}
	static void toBinary1(int num) {
		int bin=0;
		int pvalue=1;
		do {
			int remainder=num%2;
			bin=bin+pvalue*remainder;
			pvalue*=10;
			num=num/2;
		}while(num>0);
		System.out.println(bin);
	}
	

}
