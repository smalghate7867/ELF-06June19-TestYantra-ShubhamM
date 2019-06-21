package com.tyss.org.collection.set;

public class Car implements Comparable<Car>{
private String name;
private String brand;
private int cost;
private double rating;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
@Override
public int compareTo(Car o) {
	return this.name.compareTo(o.name);
}
public Car(String name, String brand, int cost, double rating) {
	super();
	this.name = name;
	this.brand = brand;
	this.cost = cost;
	this.rating = rating;
}

}
