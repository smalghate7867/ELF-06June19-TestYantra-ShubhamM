package com.tyss.hibernateapp.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentInfoBean {
	private int deptId;
	private String deptName;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "ID") private EmployeeInfoBean employeeInfoBean;
	 */
}
