package com.kn.factorial;

public class FactorialOfNumber {

	public int factorial(int input) {
		if(input==1||input==0) {
			return 1;
		}
		return input*factorial(input-1);
	}

}
