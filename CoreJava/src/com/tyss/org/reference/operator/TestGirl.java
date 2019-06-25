package com.tyss.org.reference.operator;

public class TestGirl {
public static void main(String[] args) {
	MyGirl mg=Boy :: new;
	Boy b=mg.getGirl("Riya", 5.6, 23.0);
	System.out.println(b);
	b.men();
}
}
