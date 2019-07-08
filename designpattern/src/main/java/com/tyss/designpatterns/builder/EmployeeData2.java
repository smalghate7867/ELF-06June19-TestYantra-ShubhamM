package com.tyss.designpatterns.builder;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public final class EmployeeData2 {

	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joiningDate;
	private long accountNumber;
	private String email;
	private String designation;
	private Date dob;
	private int deptId;
	private int mngrId;

	private EmployeeData2(EmployeeData2builder builder) {
		id = builder.deptId;
		name = builder.name;
		age = builder.age;
		gender = builder.gender;
		salary = builder.salary;
		phone = builder.phone;
		joiningDate = builder.joiningDate;
		accountNumber = builder.accountNumber;
		email = builder.email;
		designation = builder.designation;
		dob = builder.dob;
		deptId = builder.deptId;
		mngrId = builder.mngrId;

	}

	public static class EmployeeData2builder {

		private int id;
		private String name;
		private int age;
		private String gender;
		private double salary;
		private long phone;
		private Date joiningDate;
		private long accountNumber;
		private String email;
		private String designation;
		private Date dob;
		private int deptId;
		private int mngrId;

		public EmployeeData2builder id(int id) {
			this.id = id;
			return this;
		}

		public EmployeeData2builder name(String name) {
			this.name = name;
			return this;
		}

		public EmployeeData2builder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeData2builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public EmployeeData2builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeData2builder phone(int phone) {
			this.phone = phone;
			return this;
		}

		public EmployeeData2builder joiningDate(Date joiningDate) {
			this.joiningDate = joiningDate;
			return this;
		}

		public EmployeeData2builder accountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public EmployeeData2builder email(String email) {
			this.email = email;
			return this;
		}

		public EmployeeData2builder designation(String designation) {
			this.designation = designation;
			return this;
		}

		public EmployeeData2builder dob(Date dob) {
			this.dob = dob;
			return this;
		}

		public EmployeeData2builder deptId(int deptId) {
			this.deptId = deptId;
			return this;
		}

		public EmployeeData2builder mngrId(int mngrId) {
			this.mngrId = mngrId;
			return this;
		}
		public EmployeeData2 build() {
			return new EmployeeData2(this);
		}
	}//end of inner class
}// end of class
