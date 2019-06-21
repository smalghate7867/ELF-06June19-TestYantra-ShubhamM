package com.tyss.org.bean;

import lombok.extern.java.Log;

@Log
public class MyArray {
	// private static final Logger log=Logger.getLogger("Test");
	public static void main(String[] args) {
		int incrementVar = 11;
		MyArrayClass mArray = new MyArrayClass();

		for (int i = 0; i < incrementVar; i++) {
			mArray.add("value added :" + i);

		}
		long startTime = System.currentTimeMillis();
		log.info("start time-------------------------------" + startTime);
		mArray.remove(5);
		long endTime = System.currentTimeMillis();
		log.info("end time---------------------------------" + endTime);

		for (int i = 0; i < incrementVar; i++) {
			log.info("get values :" + mArray.get(i));
		}

	}
}
