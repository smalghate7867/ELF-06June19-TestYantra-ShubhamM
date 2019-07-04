package com.tyss.hibernateapp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp_info ")
public class EmployeeInfoBean implements Serializable {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "AGE")
	private int age;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "SALARY")
	private double salary;
	@Column(name = "PHONE")
	private long phone;
	@Column(name = "JOINING_DATE")
	private Date joiningDate;
	@Column(name = "ACCOUNT_NO")
	private long accountNumber;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "DESIGNNATION")
	private String designation;
	@Column(name = "DOB")
	private Date dob;

	
	@Column(name = "DEPT_ID")
	private int deptId;
	
	
	@Column(name = "MNGR_ID")
	private int mngrId;
	
	/*
	 * @OneToMany(mappedBy = "emp_info") private Set deptId;
	 */
}
