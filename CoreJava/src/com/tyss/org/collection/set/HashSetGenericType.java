package com.tyss.org.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetGenericType {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("shubham");
		hs.add("malghate");
		hs.add("riya");
		hs.add("kunal");
		hs.add("dhoni");
		hs.add("rohit");

		for (String str : hs) {
			System.out.println(str);
		}

		Iterator<String> string = hs.iterator();
		while (string.hasNext()) {
			String string2 = (String) string.next();
			System.out.println(string2);
		}

	}

}
