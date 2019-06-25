package com.tyss.org.thread.runnable;

public class TestMarker {
	public static void main(String[] args) {
		Marker m = new Marker();
		Thread t = new Thread(m);
		t.start();

		Thread t2 = new Thread(m);
		t2.start();

	}
}
