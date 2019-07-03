package com.tyss.jdbcapp.common;

public class ClassB implements  Connection{

	@Override
	public void printMessage() {
		System.out.println("in class b");
	}

}
