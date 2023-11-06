package com.kn.customexception;

public class OverAgeException extends Exception {

	public OverAgeException() {
		super();
	}
	
	public OverAgeException(String string) {
		super(string);
	}
	
//	public String toString() {
//		return "over age Exception";
//	}

}
