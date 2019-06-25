package com.tyss.org.thread;

import lombok.extern.java.Log;

@Log
public class TestThreadpen {
	public static void main(String[] args) {
		log.info("main start");
		Pen p = new Pen();
		// System.out.println(p.getState());
		p.setName("shubham");
		p.run();
		// System.out.println(p.getState());

		Pen p2 = new Pen();
		p2.setName("ran");
		p2.run();

		Pen p3 = new Pen();
		p3.start();
		log.info("main end");

	}
}
