package com.tyss.java.test.compare.object;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.tyss.java.test.sort.student.Student;

public class TestObject {
	private static final Logger log = Logger.getLogger("TestSimpleIntrest");

	public static void main(String[] args) {
		Employee emp = new Employee(1, "shubham", 22);
		Employee emp2 = new Employee(1, "shubham", 22);

		boolean result = emp.equals(emp2);
log.info("Object Comp result"+result);
	}
}
