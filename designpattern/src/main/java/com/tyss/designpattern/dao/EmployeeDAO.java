package com.tyss.designpattern.dao;

import java.util.List;

import com.tyss.designpattern.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	List<EmployeeInfoBean> getAllEmployeeInfo();

	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);
	
	boolean  createEmployeeInfo(EmployeeInfoBean bean);
	
	boolean  updateEmployeeInfo(EmployeeInfoBean bean);
	
	boolean  deleteEmployeeInfo(int id);
	
	boolean  deleteEmployeeInfo(String id);
	
}// END of interface
