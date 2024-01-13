package com.kn.thread.daemon_thread;

public class TypingCode extends Thread {
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("Typing Code");
			try {
				super.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
