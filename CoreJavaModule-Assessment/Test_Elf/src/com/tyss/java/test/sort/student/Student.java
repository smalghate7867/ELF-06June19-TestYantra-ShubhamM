package com.tyss.java.test.sort.student;

public class Student {
	Integer rollNo;
	String firstName;
	Double percentage;
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public Student(Integer rollNo, String firstName, Double percentage) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", percentage=" + percentage + "]";
	}

}
