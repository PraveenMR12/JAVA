package com.kn.threadsdemo1;

public class PrintNumbers extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<7; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
