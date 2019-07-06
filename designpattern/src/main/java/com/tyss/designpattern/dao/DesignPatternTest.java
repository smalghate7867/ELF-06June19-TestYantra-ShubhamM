package com.tyss.designpattern.dao;

import java.util.Date;
import java.util.List;

import com.tyss.designpattern.beans.EmployeeInfoBean;

import lombok.extern.java.Log;
import static java.lang.System.*;

/**
 * Hello world!
 *
 */
@Log
public class DesignPatternTest {
	public static void main(String[] args) {
		/*
		 * EmployeeDAO impl = new EmployeeDAOJDBCImpl();
		 * EmployeeDAO impl = new EmployeeDAOHibernateImpl();
		 */
		EmployeeDAO impl = EmployeeDAOFactory.getInstance();
		printData(impl.getEmployeeInfo("2"));
		printData(impl.getEmployeeInfo(3));
		List<EmployeeInfoBean> beans = impl.getAllEmployeeInfo();
		for (EmployeeInfoBean employeeInfoBean : beans) {
			printData(employeeInfoBean);
		}

		
		//Create employee info
		EmployeeInfoBean emp1 = new EmployeeInfoBean();
		emp1.setId(10);
		emp1.setName("anyname");
		emp1.setAge(24);
		emp1.setGender("male");
		emp1.setSalary(1000000);
		emp1.setPhone(1234567890);
		emp1.setJoiningDate(new Date(2019, 06, 12));
		emp1.setAccountNumber(123456);
		emp1.setEmail("anyname@gmail.com.com");
		emp1.setDesignation("Software Engineer");
		emp1.setDob(new Date(2019, 06, 12));
		emp1.setDeptId(3);
		emp1.setMngrId(5);
		
	//	log.info("DATA INSERTED"+impl.createEmployeeInfo(emp1));
		
		// to delete by id
		impl.deleteEmployeeInfo(8);
		impl.deleteEmployeeInfo("9");
		
	}

	private static void printData(EmployeeInfoBean emp) {
		out.println("id" + emp.getId());
		out.println("name" + emp.getName());
		out.println("salary" + emp.getSalary());
		out.println("gender" + emp.getGender());
		out.println("dept id" + emp.getDeptId());
		out.println("ac no" + emp.getAccountNumber());
		out.println("age" + emp.getAge());
		out.println("designation" + emp.getDesignation());
		out.println("dob" + emp.getDob());
		out.println("email" + emp.getEmail());
		out.println("joiningdate" + emp.getJoiningDate());
		out.println("mngr id" + emp.getMngrId());
		out.println("phone" + emp.getPhone());
	}
}
