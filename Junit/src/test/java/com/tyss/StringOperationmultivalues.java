package com.tyss;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.tyss.junit.StringOperation;

@RunWith(Parameterized.class)
public class StringOperationmultivalues {

	private String name;
	private int value;

	public StringOperationmultivalues(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	@Parameters
	public static Collection<Object[]> getValues() {
		Object[][] obj = { { "riya", 4 }, { "shubhamm", 8 }, { "adi", 3 } };
		return Arrays.asList(obj);

	}

	private StringOperation str = new StringOperation();

	@Test
	public void testMultipleString() {
		int result = str.count(name);
		assertEquals(value, result);
	}
}
