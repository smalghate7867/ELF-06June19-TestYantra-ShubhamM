package com.tyss.designpatterns.builder;

import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableTest {
	public static void main(String[] args) {

		EmployeeData emp = new EmployeeData(1, "shubham", 21, "M", 111.00, 123, new Date(), 123, "email", "S.E",
				new Date(), 1, 2);
		System.out.println(emp.toString());
		Date date=new Date();
		EmployeeData2 data2=new EmployeeData2
				.EmployeeData2builder()
				.id(111)
				.name("shubham")
				.age(21)
				.gender("m")
				.salary(1000.30)
				.phone(8455)
				.joiningDate(date)
				.accountNumber(12135)
				.email("smaklgh@gmail.com")
				.designation("SE")
				.dob(date)
				.deptId(1)
				.mngrId(2)
				.build();
		System.out.println(data2.toString());
		
		EmployeeData3 data3 =new EmployeeData3
				.EmployeeData3Builder()
				.id(22)
				.name("riya")
				.age(22)
				.gender("f")
				.salary(1000.30)
				.phone(8455)
				.joiningDate(date)
				.accountNumber(12135)
				.email("riya@gmail.com")
				.designation("SD")
				.dob(date)
				.deptId(1)
				.mngrId(2)
				.build();
		System.out.println(data3.toString());
	}
}
