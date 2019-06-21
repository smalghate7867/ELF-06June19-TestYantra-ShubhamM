package com.tyss.org.collection.set;

import java.util.TreeSet;
public class TreeSetExampleStudent {
public static void main(String[] args) {
	TreeSet<Student> treeSet=new TreeSet<Student>();
	Student s1=new Student();
	s1.setId(1);
	s1.setName("shubham");
	s1.setPercentage(98.00);

	Student s2 = new Student();
	s2.setId(2);
	s2.setName("Riya");
	s2.setPercentage(98.00);

	Student s3 = new Student();
	s3.setId(3);
	s3.setName("Aish");
	s3.setPercentage(98.00);
	
	treeSet.add(s1);
	treeSet.add(s2);
	treeSet.add(s3);
	
		
		 treeSet.forEach(ref->{
		 System.out.println(ref.getId());
		 System.out.println(ref.getName());
		 System.out.println(ref.getPercentage());
		 });
	
	
		/*
		 * for(Student stu:treeSet) { System.out.println(stu.getId());
		 * System.out.println(stu.getName()); System.out.println(stu.getPercentage()); }
		 */
}
}
