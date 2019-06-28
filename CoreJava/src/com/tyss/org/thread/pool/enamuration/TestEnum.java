package com.tyss.org.thread.pool.enamuration;

import lombok.extern.java.Log;

@Log
public class TestEnum {
	public static void main(String[] args) {
		/*
		 * log.info(" :info male :"+ Gender.MALE);
		 * log.info(" :info frmale :"+Gender.FEMALE);
		 * log.info(" :info other :"+Gender.OTHER);
		 */

		Gender option = Gender.MALE;

		switch (option) {
		case MALE:
			log.info(" :info male :");

			break;
		case FEMALE:
			log.info(" :info FEMALE :");

			break;
		case OTHER:
			log.info(" :info other :");

			break;

		default:
			break;
		}
	}
}
