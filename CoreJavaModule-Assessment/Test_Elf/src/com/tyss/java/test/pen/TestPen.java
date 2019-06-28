package com.tyss.java.test.pen;

import java.util.ArrayList;
import java.util.logging.Logger;

public class TestPen {
	private static final Logger log = Logger.getLogger("TestPen");

	public static void main(String[] args) {
		Pen pen1 = new Pen(2, "Cello", 10.55);
		Pen pen2 = new Pen(3, "Montax", 55.55);
		Pen pen3 = new Pen(1, "Mercury", 50.2);
		Pen pen4 = new Pen(5, "NATRAJ", 10.55);
		Pen pen5 = new Pen(4, "GelPen", 100.0);

		ArrayList<Pen> al = new ArrayList<Pen>();
		al.add(pen1);
		al.add(pen2);
		al.add(pen3);
		al.add(pen4);
		al.add(pen5);

		al.forEach(getPenObject -> {
			log.info("Pen Details-->: " + getPenObject);
		});
	}
}
