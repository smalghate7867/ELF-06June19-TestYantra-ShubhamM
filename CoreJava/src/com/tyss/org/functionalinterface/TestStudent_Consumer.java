package com.tyss.org.functionalinterface;

import java.util.function.Consumer;

public class TestStudent_Consumer {
	public static void main(String[] args) {

		Consumer<Student> c = stu -> {
			double a = (stu.m1 + stu.m2 + stu.m3) / 3;
			System.out.println(a);
		};
		Student stu = new Student("shubham", 100, 100, 100);
		c.accept(stu);
	}
	/*
	 * public void studAvg(Student stu) { double a=(stu.m1+stu.m2+stu.m3)/3;
	 * System.out.println(a); }
	 */

}
