package com.tyss.org.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySearchElement {

	public static void main(String[] args) {
		int[] array = { 15, 6, 19, 4, 13, 16 };
		Arrays.sort(array);
		int index=Arrays.binarySearch(array, 1111);
		System.out.println(index);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		//searchArrayElement(420);
	}

	/*
	 * public static boolean searchArrayElement(int a) { boolean result = false;
	 * int[] m = { 15, 6, 19, 4, 13, 16 }; for (int i = 0; i < m.length;) { if (m[i]
	 * == a) { System.out.println("ELEMENT FOUND"); result = true; break; } else {
	 * result = false;
	 * 
	 * System.out.println("ELEMENT NOT FOUND"); break;
	 * 
	 * } } return result; }
	 */
}
