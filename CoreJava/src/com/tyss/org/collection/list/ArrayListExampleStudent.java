package com.tyss.org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExampleStudent {
	public static void main(String[] args) {
		ArrayList<Student> stu = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("shubham");
		s1.setPercentage(98.00);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Riya");
		s2.setPercentage(98.00);

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("rehana");
		s3.setPercentage(98.00);

		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		for (Student ss : stu) {
			System.out.println(ss.getId());
			System.out.println(ss.getName());
			System.out.println(ss.getPercentage());
			System.out.println("-------");
		}

		for (int i = 0; i < stu.size(); i++) {
			Student ss = stu.get(i);
			System.out.println(ss.getId());
			System.out.println(ss.getName());
			System.out.println(ss.getPercentage());
			System.out.println("++++++++");
		}
		
		stu.forEach(refvar->{
			System.out.println(refvar.getId());
			System.out.println(refvar.getName());
			System.out.println(refvar.getPercentage());
			System.out.println("````````");
		});

		Iterator<Student> itr = stu.iterator();
		while (itr.hasNext()) {
			Student student =  itr.next();
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getPercentage());
			System.out.println("********");
		}
		ListIterator<Student> listItr = stu.listIterator();
		while (listItr.hasNext()) {
			Student student =  listItr.next();
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getPercentage());
			System.out.println("////////");
		}

	}
}
