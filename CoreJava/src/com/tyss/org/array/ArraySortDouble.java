package com.tyss.org.array;

import java.util.Arrays;

public class ArraySortDouble {

	public static void main(String[] args) {
		double[] a = { 50.0, 20.0, 1.0, 4.0, 30.0 };
		Arrays.sort(a);
		/*
		 * for (int i = 0; i < a.length; i++) { for (int j = 0; j < i; j++) { if (a[i] <
		 * a[j]) { double temp = 0; temp = a[i]; a[i] = a[j]; a[j] = temp;
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
