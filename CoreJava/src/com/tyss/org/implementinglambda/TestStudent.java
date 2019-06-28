package com.tyss.org.implementinglambda;

import java.util.Comparator;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Shubham", "m",50.0);
		Student s2 = new Student(2, "Riya", "m",60.2);
		Student s3 = new Student(3, "Akshay", "m",70.2);
		Student s4 = new Student(4, "ranji", "m",80.2);

		// sort by id
		Comparator<Student> strInt = (e, f) -> {
			if (e.id > f.id) {
				return 1;
			} else if (e.id < f.id) {
				return -1;
			}
			return 0;
		};
		
		// sort by name
		Comparator<Student> strCmpPercentage = (e1, f1) -> e1.getPercentage().compareTo(f1.getPercentage());


		StudentSortById e = new StudentSortById();
		//TreeSet<Student> stu = new TreeSet(e);
		//TreeSet<Student> stu = new TreeSet(strCmpname);
		TreeSet<Student> stu = new TreeSet(strCmpPercentage);
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);

		stu.forEach(refVar -> {
			System.out.println(refVar);
		});
	}
}
