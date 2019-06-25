package com.tyss.org.functionalinterface;

public class Addition {

	public static void main(String[] args) {
		// Addition
		/*
		 * Operation sum =(a,b) ->(a+b); int add=sum.add(10, 15);
		 * System.out.println(add);
		 */

		// factorial
		/*
		 * Operation fact = a->{
		 *  int k=1;
		 *  for(int i=1;i<=a;i++) 
		 *  { 
		 *  k=k*i;
		 *   }
		 *    return k; 
		 *    };
		 * int res=fact.recursion(10); }
		 */

		// Square
		/*
		 * Operation square= a->{ return a*a; };
		 * 
		 * int result=square.square(2); System.out.println(result);
		 */

		// countChar
		Operation countChar = str -> str.length();
		int i = countChar.getCharCount("shubham");
		System.out.println(i);

	}
}
