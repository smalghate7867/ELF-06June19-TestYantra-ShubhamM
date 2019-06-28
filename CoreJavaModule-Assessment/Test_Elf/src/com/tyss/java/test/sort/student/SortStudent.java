package com.tyss.java.test.sort.student;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.logging.Logger;

public class SortStudent {
	private static final Logger log = Logger.getLogger("SortStudent");

	public static void main(String[] args) {

		Student student1 = new Student(1, "Riya", 98.89);
		Student student2 = new Student(3, "Abhi", 65.89);
		Student student3 = new Student(2, "Ziva", 95.89);
		Student student4 = new Student(5, "Nishi", 78.89);
		Student student5 = new Student(5, "Dimple", 35.89);

		Comparator<Student> cmmByrollNo = (arg1, arg2) -> arg1.getRollNo().compareTo(arg2.getRollNo());
		Comparator<Student> cmmByName = (arg1, arg2) -> arg1.getFirstName().compareTo(arg2.getFirstName());
		Comparator<Student> cmmByPercentage = (arg1, arg2) -> arg1.getPercentage().compareTo(arg2.getPercentage());

		TreeSet<Student> treeSet = new TreeSet<Student>(cmmByrollNo);
		treeSet.add(student1);
		treeSet.add(student2);
		treeSet.add(student3);
		treeSet.add(student4);
		treeSet.add(student5);
		treeSet.forEach(sortByNo -> {
			log.info("Sort by roll No :->" + sortByNo);
		});

	}
}
