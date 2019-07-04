package com.tyss.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emp_other_info")
public class EmployeeOtherInfoBean {
	@Column(name="ID")
	@Id
	private int id;
	@Column(name="PAN")
	private String pan;
	@Column(name="IS_MARRIED")
	private boolean isMarried;
	@Column(name="BLOOD_GROUP")
	private String bloodGroup;
	@Column(name="IS_CHALLANGED")
	private boolean isChallanged;
	@Column(name="EMERGENCY_CONTACT_NO")
	private long emergencyContactno;
	@Column(name="EMERGENCY_CONTACT_PERSON")
	private String emergencyContactPerson;
	@Column(name="NATIONALITY")
	private String nationality;
	@Column(name="RELOGION")
	private String religion;
	@Column(name="FATHERS_NAME")
	private String fathersName;
	@Column(name="MOTHERS_NAME")
	private String mothersName;
	@Column(name="SPOUSE_NAME")
	private String spouseName;
	@Column(name="PASSPORT")
	private String passport;
	@Column(name="AADHAR")
	private long aadhar;
}
