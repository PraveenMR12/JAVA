package com.kn.pattern;

public class ButterFly {
	public static void main(String[] args) {
		int n =4;
		int k = 0;
		for(int i=1; i<2*n;i++) {
			if(i<=n) {
				k++;
			}else {
				k--;
			}
			int m=0;
			for(int j=1; j<2*n;j++) {
				if(j<=n) {
					m++;
				}else {
					m--;
				}
				
				if(m<=k) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		pattern2(n);
	}

	private static void pattern2(int n) {
		System.out.println();
		System.out.println();		
		int k=0;
		for(int i = 1; i<2*n; i++) {
			if(i<=n) {
				k++;
			}else {
				k--;
			}
			int m=0;
			for(int j=1; j<2*n; j++) {
				if(j<=n) {
					m++;
				}else {
					m--;
				}
				if(m!=5-k) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	
	
}
