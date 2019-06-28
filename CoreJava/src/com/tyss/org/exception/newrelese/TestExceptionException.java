package com.tyss.org.exception.newrelese;

import lombok.extern.java.Log;

@Log
public class TestExceptionException {
	public static void main(String[] args) {
		int i = 0;
		int j = 5;
		try {
			int result = j / i;
			log.info("result is :" + result);
		} catch (ArithmeticException | NullPointerException e) {
			log.info("exception is" + e);
		}

	}
}
