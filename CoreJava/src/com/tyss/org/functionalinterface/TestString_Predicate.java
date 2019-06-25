package com.tyss.org.functionalinterface;

import java.util.function.Predicate;

public class TestString_Predicate {
	public static void main(String[] args) {
		Predicate<String> s = a -> a.length() == 5;
		boolean result = s.test("abcdd");
		System.out.println(result);
	}
}
