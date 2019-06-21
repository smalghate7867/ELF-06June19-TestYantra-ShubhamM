package com.tyss.org.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm=new TreeMap<String, Integer>();
		tm.put("one", 1);
		tm.put("two", 2);
		tm.put("three", 3);
		tm.put("four", 4);
		tm.put("five", 5);
		
		for(Map.Entry<String, Integer> t:tm.entrySet()) {
			String key=t.getKey();
			int value=t.getValue();
			System.out.println(key);
			System.out.println(value);
		}
	}
	
	

}
