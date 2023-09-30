package com.kn.gcdofnumber;

public class GCDOfNumber {

	public int gcdOfNum(int n1, int n2) {
		if(n2==0) {
			return n1;
		}
		return gcdOfNum(n2, n1%n2);
	}

}
