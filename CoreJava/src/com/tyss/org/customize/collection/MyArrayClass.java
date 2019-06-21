package com.tyss.org.bean;

public class MyArrayClass {
	private Object[] myArray;
	private int index;
	private static int initialSize = 10;

	public MyArrayClass() {

		this(initialSize);
	}

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("Size Should be greater than 0...!");
		}
		myArray = new Object[size];
		index = 0;
	}

	public void add(Object val) {
		if (index >= myArray.length) {
			Object[] newArray = new Object[initialSize * 2];
			System.arraycopy(myArray, 0, newArray, 0, myArray.length);
			myArray = newArray;
		}
		myArray[index] = val;
		index++;
	}

	public Object get(int position) {
		return myArray[position];
	}

	public void remove(int position) {
		/*
		 * myArray[myArray.length-1] =myArray[position];
		 * 
		 * for (int i = position; i < myArray.length-1; i++) { //
		 * myArray[i]=myArray[i+1] ; System.arraycopy(myArray, position, myArray, (int)
		 * myArray[i+1], myArray.length); }
		 */

		if (position > myArray.length) {
			System.out.println("out");
			throw new ArrayIndexOutOfBoundsException("Size Exceding the limits!");

		} else {
			System.out.println("in");
			System.arraycopy(myArray, position + 1, myArray, position, myArray.length - 1 - position);
		}

	}

	public int getsize() {
		return index - 1;
	}
}// end of MyArrayClass
