package com.tyss.org.reference.operator;

public class Product {
String name;
double cost;
public Product(String name, double cost) {
	super();
	this.name = name;
	this.cost = cost;
}
void getProduct() {
	System.out.println("in producty");
}
@Override
public String toString() {
	return "Product [name=" + name + ", cost=" + cost + "]";
}

}
