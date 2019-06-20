package com.tyss.org.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorGenericExample {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(5);
		v.add(15);

		for (Integer i : v) {
			System.out.println(i);
		}
		v.forEach(ref -> {
			System.out.println(ref);
		});

		for (int i = 0; i < v.size(); i++) {
			Integer i1 = v.get(i);
			System.out.println(i1);
		}

		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);

		}

		ListIterator<Integer> in = v.listIterator();
		while (in.hasNext()) {
			Integer integer = (Integer) in.next();
			System.out.println(integer);

		}
	}

}
