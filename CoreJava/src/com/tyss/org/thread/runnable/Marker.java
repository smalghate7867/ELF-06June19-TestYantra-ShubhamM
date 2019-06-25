package com.tyss.org.thread.runnable;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			log.info("msg");
		}
	}

}
