package com.kn.pattern;

public class ButterFly {
	public static void main(String[] args) {
		int n =4;
		int k = 0,m=0;
		for(int i=1; i<2*n;i++) {
			if(i<=n) {
				k++;
			}else {
				k--;
			}
			
			for(int j=1; j<2*n;j++) {
				if(k>=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
