package com.kn.threadsdemo1;

public class PrintCharacters extends Thread {
	@Override
	public void run() {
		for(int i=65; i<70; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
