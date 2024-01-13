package com.kn.thread_join_insta;

public class InstagramApp {

	public static void main(String[] args) {
		Reels reels = new Reels();
		Chat chat = new Chat();
		reels.start();
		try {
			chat.join();	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		chat.start();
		try {
			reels.join();	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}



	}

}
