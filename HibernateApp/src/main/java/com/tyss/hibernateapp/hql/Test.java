package com.tyss.hibernateapp.hql;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class Test {
	static Map<String, Object> map=new HashMap<String, Object>();

public static void main(String[] args) {
	
	Random r=new Random();
	int num=r.nextInt(10);
	for(int i=0;i<10;i++)
	System.out.println(num);
	
		/*
		 * for(int i=0;i<10;i++) { map.put("Stud1", r.ints()); map.put("Stud2",
		 * r.ints()); }
		 */
	
}
}
