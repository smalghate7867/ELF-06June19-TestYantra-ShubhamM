package com.tyss;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tyss.junit.StringOperation;

public class StringOperationTest {
	private StringOperation strOpr = new StringOperation();

	@Test
	public void countTest() {
		assertEquals(7, strOpr.count("shubham"));
	}

	@Test
	public void toUpcasetTest() {

		assertEquals("SHUBHAM", strOpr.toUpcase("shubham"));
	}

}
