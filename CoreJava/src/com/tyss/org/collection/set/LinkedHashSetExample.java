package com.tyss.org.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add("Shubham");
		ls.add(1);
		ls.add('c');
		ls.add(10.2);
		ls.add("M");

		for (Object o : ls) {
			System.out.println(o);
		}

		Iterator itr = ls.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);

		}
	}

}
