package com.tyss.hibernate.assessment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Student {
	@Id
	@GeneratedValue
	private int rollNum; 
	private String firstName;
	private String lastName;
	private String subject;
	private Double totalMarks;
}
