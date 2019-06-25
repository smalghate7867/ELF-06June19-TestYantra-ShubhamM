package com.tyss.org.reference.operator;

public class Home {
	static void open() {
		System.out.println("open method");
	}

	public static void main(String[] args) {
		Room r = Home::open;
		r.remove();
	}
}

