package com.tyss.org.reference.operator;

public class Boy {
String name;
double height;
double age;
public Boy(String name, double height, double age) {
	super();
	this.name = name;
	this.height = height;
	this.age = age;
}

 @Override
public String toString() {
	return "Boy [name=" + name + ", height=" + height + ", age=" + age + "]";
}

void men() {
	 System.out.println("in boy ");
	 
 }
}
