package com.kn.pattern;

public class Pattern36 {

	public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(k + " ");
                k = k * (i - j) / (j + 1);
            }
            System.out.println();
        }
	
	}

}
