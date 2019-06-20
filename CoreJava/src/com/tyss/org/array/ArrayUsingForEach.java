package com.tyss.org.array;

public class ArrayUsingForEach {
public static void main(String[] args) {
	String [] str= {"hi","Iam","Shubham","Ziva","Rahuil"};
	int [] intArray= {10,8,2,20,4};
	double[] doubleArray= {90.0,50.0,22.00,22.33};
	
	for(String strRef : str) {
		System.out.println(strRef);
	}
	for(int intRef : intArray) {
		System.out.println(intRef);
	}
	for(double doubleref : doubleArray) {
		System.out.println(doubleref);
	}
	}
}

