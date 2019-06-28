package com.tyss;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tyss.junit.BooleanOperation;

public class BooleanOperationTest {
	private BooleanOperation boolOpr = new BooleanOperation();

	@Test
	public void oddEvenTestEven() {

		assertEquals(true, boolOpr.booleancheck(10));
	}

}
