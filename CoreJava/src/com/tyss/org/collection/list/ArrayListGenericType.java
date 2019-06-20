package com.tyss.org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListGenericType {
public static void main(String[] args) {
	ArrayList<Integer> alInt=new ArrayList<Integer>();
	alInt.add(10);
	alInt.add(22);
	alInt.add(30);
	alInt.add(14);
	alInt.add(01);
	
		/*
		 * for(Integer d: alInt) { System.out.println(d); }
		 */
	
		/*
		 * Iterator<Integer> itrInt=alInt.iterator(); while (itrInt.hasNext()) { Integer
		 * integer = (Integer) itrInt.next(); System.out.println(integer);
		 * 
		 * }
		 */
	ListIterator<Integer> listIntIterator=alInt.listIterator();
	while (listIntIterator.hasNext()) {
		Integer integer = (Integer) listIntIterator.next();
		System.out.println(integer);
		
	}
}
}
