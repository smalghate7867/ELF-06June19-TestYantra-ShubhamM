package com.tyss.org.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Shubham");
		v.add(1);
		v.add('c');
		v.add(10.2);
		v.add("M");

		for (Object o : v) {
			System.out.println(o);
		}
		for (int i = 0; i < v.size(); i++) {
			Object o = v.get(i);
			System.out.println(o);
		}
		v.forEach(ref -> {
			System.out.println(ref);
		});

		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);

		}
		ListIterator list = v.listIterator();
		while (list.hasNext()) {
			Object object = (Object) list.next();
			System.out.println(object);

		}

		Enumeration enu=v.elements();
		while (list.hasNext()) {
			Object object = (Object) list.next();
			System.out.println(object);
			
		}
	}

}
