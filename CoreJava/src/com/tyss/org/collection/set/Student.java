package com.tyss.org.collection.set;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	/* logic to sort student wrt Percentage*/
	/*
	 * @Override public int compareTo(Student o) { if(this.percentage <o.percentage)
	 * { return -1; }else if (this.percentage > o.percentage) { return 1; }else {
	 * return 0; } }
	 */
	@Override
	public int compareTo(Student o) {
		Integer num1=this.id;
		Integer num2=o.id;
		return num1.compareTo(num2);
	}
	
	/* logic to sort student wrt Id*/
	/*
	 * @Override public int compareTo(Student o) { if(this.id < o.id) { return -1;
	 * }else if (this.id > o.id) { return 1; }else { return 0; }
	 * 
	 * }
	 */
	
	/* logic to sort student wrt name*/
	/*
	 * @Override public int compareTo(Student o) { int
	 * i=this.name.compareTo(o.name); return i;
	 * 
	 * }
	 */
}
