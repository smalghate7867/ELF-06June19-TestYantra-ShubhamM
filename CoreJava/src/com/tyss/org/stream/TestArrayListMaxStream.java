package com.tyss.org.stream;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class TestArrayListMaxStream {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		Comparator<Integer> cmp = (i, j) -> i.compareTo(j);
		Integer maxValue = al.stream().max(cmp).get();
		log.info("max value: " + maxValue);

	}
}
