package com.tyss.java.test.pen;

public class Pen {
	Integer id;
	String penName;
	Double penCost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPenName() {
		return penName;
	}

	public void setPenName(String penName) {
		this.penName = penName;
	}

	public Double getPenCost() {
		return penCost;
	}

	public void setPenCost(Double penCost) {
		this.penCost = penCost;
	}

	public Pen(Integer id, String penName, Double penCost) {
		super();
		this.id = id;
		this.penName = penName;
		this.penCost = penCost;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", penName=" + penName + ", penCost=" + penCost + "]";
	}

}
