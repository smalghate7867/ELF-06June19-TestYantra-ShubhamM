package com.tyss.org.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetGenericType {
public static void main(String[] args) {
	TreeSet<String> str=new TreeSet<String>();
	str.add("Shubham");
	str.add("Abhi");
	str.add("Ziva");
	str.add("Ravi");
	str.add("Fiza");
	str.add("Aish");
	for(String string:str) {
		System.out.println(string);
	}
	str.forEach(ref->{
		System.out.println(str);
	});
	
	Iterator itr=str.iterator();
	while (itr.hasNext()) {
		Object object = (Object) itr.next();
		System.out.println(object);
	}
	
}
}
