package com.tyss.org.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListGenericType {

	public static void main(String[] args) {
		LinkedList<Character> c = new LinkedList<Character>();
		c.add('a');
		c.add('e');
		c.add('i');
		c.add('o');
		c.add('u');

		for (Character ch : c) {
			System.out.print(ch);
		}

		c.forEach(ref -> {
			System.out.println(ref);
		});

		for (int i = 0; i < c.size(); i++) {
			Character ch = c.get(i);
			System.out.print(ch);
		}

		Iterator<Character> ch = c.iterator();
		while (ch.hasNext()) {
			Character character = ch.next();
			System.out.println(character);

		}

		ListIterator<Character> ch1 = c.listIterator();
		while (ch1.hasNext()) {
			Character character = ch1.next();
			System.out.println(character);

		}

	}

}
