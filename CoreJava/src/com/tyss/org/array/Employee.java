package com.tyss.org.array;

public class Employee {
private int id;
private String fName;
private String age;
private double salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", fName=" + fName + ", age=" + age + ", salary=" + salary + "]";
}


}
