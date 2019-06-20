package com.tyss.org.array;

import java.util.Arrays;

public class ArrayGetObjEmp {
	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setfName("SHubham");
		e1.setAge(21 + "");
		e1.setSalary(10000.00);

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setfName("Rehana");
		e2.setAge(22 + "");
		e2.setSalary(20000.00);

		Employee e3 = new Employee();
		e3.setId(1);
		e3.setfName("Riya");
		e3.setAge(21 + "");
		e3.setSalary(10000.00);

		Employee e4 = new Employee();
		e4.setId(1);
		e4.setfName("Rahul");
		e4.setAge(21 + "");
		e4.setSalary(20000.00);

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
        //Arrays.sort(emp); needs extends comparablel
		for (Employee empRef : emp) {
			System.out.println(empRef);
		}
	}

}
