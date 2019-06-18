package com.tyss.org.bean;

import java.util.Date;

public class EmployeeBean {
	private int id;
	private String name;
	private String department;
	private double salry;
	private int age;
	private Date dateofJoining;
	private String gender;

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalry() {
		return salry;
	}

	public void setSalry(double salry) {
		this.salry = salry;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateofJoining() {
		return dateofJoining;
	}

	public void setDateofJoining(Date dateofJoining) {
		this.dateofJoining = dateofJoining;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public EmployeeBean(int id, String name, String department, double salry, int age, Date dateofJoining,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salry = salry;
		this.age = age;
		this.dateofJoining = dateofJoining;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", department=" + department + ", salry=" + salry
				+ ", age=" + age + ", dateofJoining=" + dateofJoining + ", gender=" + gender + "]";
	}

}
