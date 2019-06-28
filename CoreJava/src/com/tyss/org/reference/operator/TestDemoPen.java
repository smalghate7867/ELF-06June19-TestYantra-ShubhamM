package com.tyss.org.reference.operator;

import lombok.extern.java.Log;

@Log
public class TestDemoPen {
	void write(int x) {
		log.info("in write" + x);
	}

	public static void main(String[] args) {
		DemoPen d = x -> log.info("value :" + x);
		d.print(10);

		//// OR////

		//
		TestDemoPen p = new TestDemoPen();
		DemoPen dp = Shop.p::write;
		dp.print(10);

	}
}
