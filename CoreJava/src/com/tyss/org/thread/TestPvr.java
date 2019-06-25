package com.tyss.org.thread;

public class TestPvr {
	public static void main(String[] args) {
		Pvr p = new Pvr();
		Browser b = new Browser(p);
		b.start();

		Browser b2 = new Browser(p);
		b2.start();

		Browser b3 = new Browser(p);
		b3.start();
	}
}
