package com.tyss.org.collection.list;

import java.util.ArrayList;

public class ArrayListDoubleExample5 {
	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);
		
		System.out.println("Before-------->>"+al);
		
		boolean res=al.remove(12.4);
		System.out.println("result  index->> "+res);
		
		System.out.println("After--------->>"+al);


	}
}
