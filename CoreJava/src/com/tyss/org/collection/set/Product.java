package com.tyss.org.collection.set;

public class Product implements Comparable<Product>{
	
	private String productName;
	private int price;
	private double rating;
	
	
	public Product(String productName, int price, double rating) {
		super();
		this.productName = productName;
		this.price = price;
		this.rating = rating;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public int compareTo(Product o) {
		if (this.rating < o.rating) {
			return -1;
		}else if (this.rating > o.rating) {
			return 1;
		}else {
		return 0;
		}
	}

}
