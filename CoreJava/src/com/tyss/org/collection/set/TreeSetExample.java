package com.tyss.org.collection.set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(11);
		ts.add(111);
		ts.add(11);
		ts.add(11);
		for (Object obj : ts) {
			System.out.println(obj);
		}
		ts.forEach(ref->{
			System.out.println(ref);
		});
	}

}
