package com.kn.thread.daemon_thread;

public class SavingCode extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("Saving Code");
			try {
				super.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
