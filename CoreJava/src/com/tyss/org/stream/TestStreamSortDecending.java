package com.tyss.org.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestStreamSortDecending {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		// Decending logic
		Comparator<Integer> cmp = (i, j) -> i.compareTo(j) * -1;
		List<Integer> t = al.stream().sorted(cmp).collect(Collectors.toList());

		// or

		t.forEach(ref -> {
			log.info("values :" + ref);
		});

		log.info("values :" + t);

	}
}
