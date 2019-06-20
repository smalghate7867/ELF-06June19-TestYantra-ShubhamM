package com.tyss.org.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(1);
		li.add("shubham");
		li.add("shubham");
		li.add("M");
		li.add(20.00);

		for (int i = 0; i < li.size(); i++) {
			Object obj = li.get(i);
			System.out.println(obj);
		}

		for (Object o : li) {
			System.out.println(o);
		}

		Iterator itr = li.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);

		}

		ListIterator list = li.listIterator();
		while (list.hasNext()) {
			Object object = (Object) list.next();
			System.out.println(object);
		}
	}
}
