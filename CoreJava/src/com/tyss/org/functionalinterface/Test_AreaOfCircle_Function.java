package com.tyss.org.functionalinterface;

import java.util.function.Function;

public class Test_AreaOfCircle_Function {
	public static void main(String[] args) {                                                       
		
		//Area of circle using functionm
		/*
		 * Function<Double, Double> f = r -> 3.14 * r * r; double x = f.apply(500.00);
		 * System.out.println(x);
		 */
		
		//String length using functionm
		/*
		 * Function<String, Integer> f=a -> a.length(); Integer o=f.apply("shubham");
		 * System.out.println(o);
		 */
		
		//Square root
		Function<Integer, Integer> f=a->a*a;
		Integer i=f.apply(2);
		System.out.println(i);
	}
}
