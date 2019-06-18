package com.tyss.org.demo;

public class Lion implements Animal {
	void lion() {
		System.out.println("in lion");
	}

	@Override
	public void sound() {
		System.out.println("roarrr");

	}

	@Override
	public int div(int a, int b) {
		return 0;
	}

}
