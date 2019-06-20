package com.tyss.org.collection.list;

import java.util.ArrayList;

public class ArrayListDoubleExample7 {
	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(9.2);
		al.add(154.67);
		al.add(786.87);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);
		
		ArrayList<Double> b1=new ArrayList<Double>();
		b1.add(154.67);
		b1.add(786.87);
		
		System.out.println("Before-------->>"+al);
		
		al.removeAll(b1);
		
		System.out.println("After--------->>"+al);


	}
}
