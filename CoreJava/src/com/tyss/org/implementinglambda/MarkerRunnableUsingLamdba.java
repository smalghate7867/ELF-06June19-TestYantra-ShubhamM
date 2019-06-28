package com.tyss.org.implementinglambda;

import lombok.extern.java.Log;

@Log
public class MarkerRunnableUsingLamdba {
	public static void main(String[] args) {

		Runnable run = () -> {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				log.info("inside lambda");
			}
		};

		Thread t1 = new Thread(run);
		t1.start();

	}
}
