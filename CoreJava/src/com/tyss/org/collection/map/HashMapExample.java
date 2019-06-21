package com.tyss.org.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
public static void main(String[] args) {
	HashMap<String, Integer> hm=new HashMap<String,Integer>();
	hm.put("one", 1);
	hm.put("two", 2);
	hm.put("three", 3);
	hm.put("four", 4);
	hm.put("five", 5);
	
	for(Map.Entry<String, Integer> e:hm.entrySet()) {
		String key=e.getKey();
		Integer value=e.getValue();
		System.out.println("key is-->"+key);
		System.out.println("value is>"+value);
	}

}
}
