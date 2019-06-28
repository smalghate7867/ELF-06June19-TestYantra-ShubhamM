package com.tyss.java.test.maths.operation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathsOperationTest {

	private SimpleIntrest sip = new SimpleIntrest();
	private Percentage per = new Percentage();

	@Test
	public void testSimpleIntrest() {
		int actual = 864;
		int expected = sip.getSimpleIntrest(200, 36, 12);
		assertEquals(actual, expected);
	}

	@Test
	public void testPercentage() {
		double actual = 50;
		double expected = per.getPercentage(50.00, 50.00);
		assertEquals(expected, actual, "");

	}

}
