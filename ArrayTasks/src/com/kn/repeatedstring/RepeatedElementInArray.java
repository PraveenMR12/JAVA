package com.kn.repeatedstring;

import java.util.*;

public class RepeatedElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		String[] srr = new String[sc.nextInt()];
		System.out.println("Enter the "+srr.length+ " Elements to the array");
		for(int i=0; i<srr.length; i++) {
			srr[i]= sc.next();
		}
		repeatedElements(srr);
		sc.close();
	}

	static void repeatedElements(String[] srr) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<srr.length; i++) {
			for(int j=i+1; j<srr.length;j++) {
				if(srr[i]!=null) {
					if(srr[i].equals(srr[j])) {
						System.out.println("Duplicate String "+srr[j]+" found in the "+j+" index");
						srr[j]=null;
					}
				}
			}
			
		}

	}

}
