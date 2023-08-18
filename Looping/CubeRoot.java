package com.kn.dowhile;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		cubeOfNumber(num);
		sc.close();
	}

	static void cubeOfNumber(int num) {
		int i=0;
		do {
			if((i*i*i)==num) {
				System.out.println(i);
			}
			i++;
		}while(i<num/2);
	}

}
