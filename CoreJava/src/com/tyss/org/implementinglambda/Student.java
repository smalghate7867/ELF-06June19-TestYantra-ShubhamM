package com.tyss.org.implementinglambda;

import java.util.Comparator;

import lombok.Data;

@Data
public class Student {
	int id;
	String name;
	String lastname;
	Double percentage;

	public Student(int id, String name, String lastname,Double percentege) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.percentage = percentege;
	}
	
}
