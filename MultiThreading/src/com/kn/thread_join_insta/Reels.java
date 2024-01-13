package com.kn.thread_join_insta;

public class Reels extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Reels created");
			Thread.sleep(1000);
			System.out.println("Reels Uploaded");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
