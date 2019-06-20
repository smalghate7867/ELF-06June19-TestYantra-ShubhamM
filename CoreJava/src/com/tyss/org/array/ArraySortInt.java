package com.tyss.org.array;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortInt {

	public static void main(String[] args) {
		Integer[] a = { 5, 2, 1, 4, 3 };
		Arrays.sort(a);
		Arrays.sort(a, Collections.reverseOrder());
		
		/*
		 * for (int i = 0; i < a.length; i++) { for (int j = 0; j < i; j++) { if (a[i] <
		 * a[j]) { int temp = 0; temp = a[i]; a[i] = a[j]; a[j] = temp;
		 * 
		 * }
		 * 
		 * } }
		 */
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
