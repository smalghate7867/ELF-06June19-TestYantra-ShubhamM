package com.tyss;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tyss.junit.MathOperation;

public class MathOperationTest {
	private MathOperation mathopr = new MathOperation();

	@Test
	public void addTest() {

		assertEquals(mathopr.add(5, 5), 10);
	}

	@Test
	public void divtest() {
		assertEquals(mathopr.div(10, 2), 5);
	}

	@Test(expected = ArithmeticException.class)
	public void divtestException() {
		mathopr.div(10, 0);
	}

}
