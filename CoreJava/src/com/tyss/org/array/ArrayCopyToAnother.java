package com.tyss.org.array;

import java.util.Arrays;

public class ArrayCopyToAnother {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int b[] = Arrays.copyOf(a, a.length);
		/*
		 * for(int i=0;i<a.length;i++) { b[i]=a[i]; }
		 */
	
	
	for(int ref :b) {
		System.out.println(ref);
	}
}
}
