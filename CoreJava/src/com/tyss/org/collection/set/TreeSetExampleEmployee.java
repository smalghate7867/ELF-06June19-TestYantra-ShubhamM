package com.tyss.org.collection.set;

import java.util.TreeSet;

public class TreeSetExampleEmployee {
public static void main(String[] args) {
	Employee e1=new Employee(5, "Raju", 15000);
	Employee e2=new Employee(3, "Deepa", 15000);
	Employee e3=new Employee(3, "Amit", 15000);
	Employee e4=new Employee(1, "Simran", 15000);
	
	TreeSet<Employee> treeSet=new TreeSet<Employee>();
	treeSet.add(e1);
	treeSet.add(e4);
	treeSet.add(e3);
	treeSet.add(e4);
	
	treeSet.forEach(ref->{
		System.out.println(ref.getId());
		System.out.println(ref.getName());
		System.out.println(ref.getSalary());
		System.out.println("**************************");

		
	});

}
}
