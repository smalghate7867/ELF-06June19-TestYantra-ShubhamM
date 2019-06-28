package com.tyss.org.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestStream_UsingArray {
	public static void main(String[] args) {
		Integer array[] = { 5, 6, 4, 1, 2 };
		Stream<Integer> s = Stream.of(array);
		Stream<Object> s1 = Stream.of(5, 6, 4, 1, 2, "Shubham");
		s1.forEach(refVar -> {
			log.info("array ele: " + refVar);
		});

	}
}
