package com.kn.thread_join_insta;

public class Chat extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Chat started");
			Thread.sleep(1000);
			System.out.println("Chat Ended");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
