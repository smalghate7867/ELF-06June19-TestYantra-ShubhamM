package com.tyss.org.array;

public class ArrayEqualelement {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 50, 90, 30, 20, 10 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i] == b[j]) {
					System.out.println("array are equal");

				} else {
					System.out.println("array are not equal");

				}
			}
		}

	}
}
