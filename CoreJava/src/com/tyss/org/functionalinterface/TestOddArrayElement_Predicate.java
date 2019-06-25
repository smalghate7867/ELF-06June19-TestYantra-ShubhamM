package com.tyss.org.functionalinterface;

import java.util.function.Predicate;

public class TestOddArrayElement_Predicate {
	public static void main(String[] args) {
		int[] b = { 2, 5, 9, 6, 4, 3 };

		// odd only
		/*
		 * Predicate<Integer> p = a -> a % 2 != 0; for(int i=0;i<b.length;i++) {
		 * 
		 * //boolean x = p.test(b[i]); if(p.test(b[i])) { System.out.println(b[i]); }
		 * 
		 * }
		 */
		// greater than 4
		Predicate<Integer> p = a -> a > 4;
		for (int i = 0; i < b.length; i++) {

			// boolean x = p.test(b[i]);
			if (p.test(b[i])) {
				System.out.println(b[i]);
			}
			

		}
	}
}
