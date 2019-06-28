package com.tyss.java.test.thread;

import java.util.logging.Logger;

public class PrintNumber implements Runnable {
	private static final Logger log = Logger.getLogger("PrintNumber");

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				log.info("exception arrises" + e);
			}
			log.info("print numbers -->>: " + i);
		}
	}
}
