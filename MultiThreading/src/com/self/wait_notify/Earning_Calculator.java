package com.self.wait_notify;

public class Earning_Calculator extends Thread{
	int totalEarning = 0;
	public void run() {
		
		synchronized(this) {
			for(int i=0; i<10; i++) {
				totalEarning +=100;
			
			}

			this.notify();
			System.out.println("hii");
		}
		
	}

}
