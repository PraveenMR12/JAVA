package com.kn.pattern;

public class Triangle {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			boolean is=true;
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					if(is && i%2==1 || is &&j%2==0) {
					System.out.print(i);
					is= false;
					}else {
						System.out.print((char)(64+i));
						is = true;
					}
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
