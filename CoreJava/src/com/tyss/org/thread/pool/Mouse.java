package com.tyss.org.thread.pool;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable {
	String name;

	public Mouse(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.info(" task running: ");
		}
	}

}
