package com.tyss.jdbcapp.beans;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeOtherInfoBean {
	private int id;
	private String pan;
	private boolean isMarried;
	private String bloodGroup;
	private boolean isChallanged;
	private long emergencyContactno;
	private long emergencyContactPerson;
	private String nationality;
	private String religion;
	private String fathersName;
	private String mothersName;
	private String spouseName;
	private String passport;
	private long aadhar;
}
