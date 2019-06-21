package com.tyss.org.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExampleLoadEmployee {
	public static void main(String[] args) {
		EmployeeSortById eId=new  EmployeeSortById();
		EmployeeSortBySalary eSal=new EmployeeSortBySalary();
		EmployeeSortByName eName=new EmployeeSortByName();

		TreeSet<Employee> treeSet = new TreeSet<Employee>(eName);
		Employee e1 = new Employee(1, "Shubham", 5600000.35);
		Employee e2 = new Employee(2, "Rehana", 1234564.35);
		Employee e3 = new Employee(3, "Aishaa", 897894.35);
		Employee e4 = new Employee(4, "Dpk", 657886.35);

		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		treeSet.forEach(ref -> {
			System.out.println(ref.getId());
			System.out.println(ref.getName());
			System.out.println(ref.getSalary());
			System.out.println("*********************");

		});

	}


}