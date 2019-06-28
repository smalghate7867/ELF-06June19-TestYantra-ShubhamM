package com.tyss.org.thread.pool.enamuration;

import lombok.extern.java.Log;

@Log
public class TestStringInSwitch {

	public static void main(String[] args) {
		String str = "shubham";
		switch (str) {
		case "Apple":
			log.info("in apple");

			break;
		case "shubham":
			log.info("in shubham");

			break;

		default:
			log.info("in default");
			break;
		}
	}
}
