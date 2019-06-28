package com.tyss.java.test.maths.operation;

import java.util.logging.Logger;

public class AllCalculation {
	private static final Logger log = Logger.getLogger("TestSimpleIntrest");

	public static void main(String[] args) {

		Percentage.getPercentage(60, 70);
		System.out.println(Percentage.getPercentage(60, 70));
		SimpleIntrest.getSimpleIntrest(200, 36, 12);

	}
}
