package com.tyss.org.thread;

public class Browser extends Thread {
	Pvr ref;

	public Browser(Pvr ref) {
		this.ref = ref;
	}

	@Override
	public void run() {
		try {
			ref.book();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.run();
	}
}
