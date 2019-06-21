package com.tyss.org.collection.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> lhm=new LinkedHashMap<String, Integer>();
	lhm.put("one", 1);
	lhm.put("two", 2);
	lhm.put("three", 3);
	lhm.put("four", 4);
	lhm.put("five", 5);
	
	for(Map.Entry<String, Integer> m: lhm.entrySet()) {
		String key=m.getKey();
		Integer value=m.getValue();
		System.out.println(key+" --keys is");
		System.out.println(value+" --value is");
	}
	/*
	 * get only key from map using  set
	 */
	Set set=lhm.keySet();
	set.forEach(ref->{
		System.out.println(ref);
	});
	
	/*
	 * get only key from map using  collection
	 */
	Collection<Integer> ci=lhm.values();
	ci.forEach(ref->{
		System.out.println(ref);
	});
	
}
}
