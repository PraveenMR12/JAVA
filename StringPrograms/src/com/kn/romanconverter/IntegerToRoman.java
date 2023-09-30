 package com.kn.romanconverter;

public class IntegerToRoman {
	public String intToRoman(int num) {
		int[] arr= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] srr= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuilder output= new StringBuilder();
		while(num>0) {
			for(int i=0;i<arr.length;i++) {
				if(num>arr[i]) {
					num=num-arr[i];
					System.out.println();
					output.append(srr[i]);
					break;
				}
			}
		}
		return output.toString();
	}
	
	public String intToRoman1(int num) {
		int[] arr= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] srr= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuilder output= new StringBuilder();
	
			for(int i=0;i<arr.length;i++) {
				while(num>=arr[i]) {
					num=num-arr[i];
					output.append(srr[i]);
				}
			}
		return output.toString();
	}

}
