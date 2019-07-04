package com.tyss.jdbcapp.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeeExperienceInfoBean {
	private int id;
	private String educationalType;
	private String collegeName;
	private String university;
	private int yop;
	private double percentage;
	private String location;
}
