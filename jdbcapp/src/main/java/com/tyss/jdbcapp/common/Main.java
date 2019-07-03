package com.tyss.jdbcapp.common;

public class Main {
	public static void main(String args[]) {
		/*
		 * MyInterface classA=new ClassA(); classA.printMessage(); ClassB classB=new
		 * ClassB();
		 */
		String url="";
		Connection ref=DriverManager.getConnection(url);
		ref.printMessage();
	}
}
