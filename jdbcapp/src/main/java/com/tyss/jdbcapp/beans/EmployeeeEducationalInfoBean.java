package com.tyss.jdbcapp.beans;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeeEducationalInfoBean {
	private int id;
	private String companyName;
	private String designation;
	private Date joiningDate;
	private Date leavingDate;
}
