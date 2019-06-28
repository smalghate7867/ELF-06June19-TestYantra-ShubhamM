package com.tyss.java.test.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class TestThread {
	
	private static final Logger log = Logger.getLogger("TestThread");
	private static PrintNumber p = new PrintNumber();

	public static void main(String[] args) {

		Thread t1 = new Thread(p);
		t1.start();

		Thread t2 = new Thread(p);
		t2.start();

		Thread t3 = new Thread(p);
		t3.start();

		Thread t4 = new Thread(p);
		t4.start();
		Thread t5 = new Thread(p);
		t5.start();

		ExecutorService ex = Executors.newFixedThreadPool(2);
		ex.execute(t5);
		log.info("thread" + t5);
		ex.shutdown();
	}
}
