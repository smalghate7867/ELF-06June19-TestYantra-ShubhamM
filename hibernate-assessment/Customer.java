package com.tyss.hibernate.assessment;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String firstName ;
	private String lastName;
	private long contactNumber;
	private String address;
}
