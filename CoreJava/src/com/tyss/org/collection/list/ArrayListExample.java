package com.tyss.org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("shubham");
		al.add("shubham");
		al.add("M");
		al.add(20.00);
System.out.println(al);
		/*
		 * @SuppressWarnings("rawtypes") Iterator itr = al.iterator(); while
		 * (itr.hasNext()) { Object obj = itr.next(); System.out.println(obj); }
		 */

		ListIterator list = al.listIterator(al.size());
		System.out.println("<-----forward----");

		/*
		 * while(list.hasNext()) { Object obj = list.next(); System.out.println(obj); }
		 */
		
		/*
		 * System.out.println("<-----previous----"); while (list.hasPrevious()) { Object
		 * obj = list.previous(); System.out.println(obj); }
		 */
		
		/*
		 * for (Object o : al) { System.out.println(o); }
		 * 
		 * for (int i = 0; i < al.size(); i++) { Object obj = al.get(i);
		 * System.out.println(obj); }
		 * 
		 * al.forEach(obj->{ System.out.println(obj); });
		 */

	}

}
