package com.tyss.org.demo;

public class Cow implements Animal {

	void cow() {
		System.out.println("in cow");
	}

	@Override
	public void sound() {
		System.out.println("hambaaa");

	}

	@Override
	public int div(int a, int b) {
		return 0;
	}
}
