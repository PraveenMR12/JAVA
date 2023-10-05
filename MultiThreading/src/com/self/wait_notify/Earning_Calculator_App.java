package com.self.wait_notify;

public class Earning_Calculator_App {

	public static void main(String[] args) {
		Earning_Calculator calc = new Earning_Calculator();
		calc.start();
		synchronized (calc) {
			try {
				calc.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		System.out.println("Total Earning = "+calc.totalEarning);

	}

}
