package com.tyss.jdbcapp.beans;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeAddressBean {
	private int id;
	private String addressType;
	private String address1;
	private String address2;
	private String landmark;
	private String city;
	private String state;
	private String country;
	private int pinCode;
}
