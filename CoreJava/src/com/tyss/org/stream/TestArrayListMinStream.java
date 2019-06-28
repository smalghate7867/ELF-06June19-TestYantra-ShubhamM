package com.tyss.org.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestArrayListMinStream {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		Comparator<Integer> cmp = (i, j) -> i.compareTo(j);
		Integer minvalue = al.stream().min(cmp).get();
		log.info("min value: " + minvalue);

	}
}
