package com.tyss.hibernate.assessment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Product")
public class Product {
	@Id
	@GeneratedValue
	private int productID;
	private String productName;
	private Double price;
	private String colour;
	private Double weight;
}
