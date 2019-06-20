package com.tyss.org.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetGenericType {

	public static void main(String[] args) {
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("shubham");
		ls.add("malghate");
		ls.add("riya");
		ls.add("kunal");
		ls.add("dhoni");
		ls.add("rohit");

		for (String s : ls) {
			System.out.println(s);
		}
		Iterator<String> itr = ls.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);

		}
	}

}
