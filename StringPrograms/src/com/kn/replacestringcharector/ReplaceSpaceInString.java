package com.kn.replacestringcharector;

public class ReplaceSpaceInString {
	
	//using split method replacing the space
	public String replaceSpace(String inputString) {
		StringBuffer outputString = new StringBuffer();
		String[] srr = inputString.split(" ");
		for(int i=0 ; i<srr.length;i++) {
			outputString.append(srr[i]);
			if(i<srr.length-1) {
				outputString.append("$$$$");

			}
		}
		return outputString.toString();
	}
}
