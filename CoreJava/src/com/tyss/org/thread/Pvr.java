package com.tyss.org.thread;

public class Pvr {
	synchronized void book() throws InterruptedException {
		for (int i = 0; i < 2; i++) {
			Thread.sleep(1000);
			System.out.println("in logic 1-5");
		}
	}
}
