package com.tyss.org.reference.operator;

public class TestProduct {
	public static void main(String[] args) {
		Productinterface pf = Product::new;
		Product p = pf.getDetails("MOBILE", 15000.00);
		p.getProduct();
		System.out.println(p);
	}
}
