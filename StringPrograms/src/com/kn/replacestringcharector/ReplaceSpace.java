package com.kn.replacestringcharector;

public class ReplaceSpace {
	public String replaceSpace(String inputString){
		StringBuffer bufferedString = new StringBuffer(inputString);
		for(int i=0;i<bufferedString.length();i++) {
			if(bufferedString.charAt(i)==' ') {
				bufferedString.replace(i, i+1, "@@@@");
			}
		}
		return bufferedString.toString();
	}
}
