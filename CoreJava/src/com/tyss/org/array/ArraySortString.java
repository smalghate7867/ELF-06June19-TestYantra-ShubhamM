package com.tyss.org.array;

import java.util.Arrays;

public class ArraySortString {
public static void main(String[] args) {
	String a[]= {"Simple","Zimple","Dimple","Pimple","Applee","Bumble"};
	
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
