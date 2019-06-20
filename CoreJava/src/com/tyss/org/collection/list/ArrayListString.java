package com.tyss.org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListString {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("shubham");
	al.add("riya");
	al.add("rehana");
	al.add("Rahul");
System.out.println(al);
for (int i=0;i<al.size();i++) {
	String str=al.get(i);
	System.out.println(str);
}

Iterator< String> str=al.iterator();
while (str.hasNext()) {
	String string = (String) str.next();
	System.out.println(string);
	
}

ListIterator<String > list=al.listIterator();
while (list.hasNext()) {
	String string = (String) list.next();
	System.out.println(string);

	
}

}
}
