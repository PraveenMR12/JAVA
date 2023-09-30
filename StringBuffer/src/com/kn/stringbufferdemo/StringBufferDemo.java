package com.kn.stringbufferdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Ram");
		System.out.println("Data = "+ stringBuffer);
		System.out.println("Length = "+ stringBuffer.length());
		System.out.println("Capacity = "+ stringBuffer.capacity());
		
		stringBuffer.append("Sita");
		stringBuffer.append("Sita");
		stringBuffer.append("Sita");
		stringBuffer.append("Sita");
		stringBuffer.append("Sita");
		System.out.println("Data = "+ stringBuffer);
		System.out.println("Length = "+ stringBuffer.length());
		System.out.println("Capacity = "+ stringBuffer.capacity());
		
	}

}
