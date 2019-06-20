package com.tyss.org.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Shubham");
		hs.add(1);
		hs.add('c');
		hs.add(10.2);
		hs.add("M");

		for(Object o: hs) {
			System.out.println(o);
		}
		
		Iterator itr=hs.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);
			
		}
		
	}

}
