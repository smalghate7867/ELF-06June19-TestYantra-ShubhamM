package com.tyss.org.functionalinterface;

import java.util.function.Supplier;

public class TestGun_Supplier {
public static void main(String[] args) {

	Supplier<Gun> v= ()-> new Gun(100);
	Gun g=v.get();
	System.out.println(g.bullet);
}
}
