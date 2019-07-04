package com.tyss.jdbcapp.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentInfoBean {
	private int deptId;
	private String deptName;
}
