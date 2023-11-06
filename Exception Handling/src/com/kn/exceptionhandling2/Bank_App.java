package com.kn.exceptionhandling2;

class ZeroBalanceException extends Exception{
	public String toString() {
		return "Add Amount";
	}
}

public class Bank_App {

	public static void main(String[] args) {
		int balance=0;
		try {
			if(balance==0) {
				throw new ZeroBalanceException();
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
