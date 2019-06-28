package com.tyss.org.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class StudentHighestPercentageUsingStream {
	public static void main(String[] args) {

		ArrayList<Student> arrayListStudent = new ArrayList<Student>();
		Student s = new Student();
		s.setName("anjali");
		s.setPercentage(99.99);

		Student s1 = new Student();
		s1.setName("Riya");
		s1.setPercentage(88.88);

		Student s2 = new Student();
		s2.setName("Akshay");
		s2.setPercentage(77.69);

		Student s3 = new Student();
		s3.setName("ranjith");
		s3.setPercentage(95.99);

		Student s4 = new Student();
		s4.setName("Shubham");
		s4.setPercentage(98.00);

		arrayListStudent.add(s);
		arrayListStudent.add(s1);
		arrayListStudent.add(s2);
		arrayListStudent.add(s3);
		arrayListStudent.add(s4);

		Comparator<Student> cmp = (i, j) -> i.getPercentage().compareTo(j.getPercentage());
		Student maxValuePerc = arrayListStudent.stream().max(cmp).get();

		log.info("highest percentage: " + maxValuePerc.getName());
		log.info("highest percentage: " + maxValuePerc.getPercentage());
		log.info("highest percentage: " + maxValuePerc);

		Student stuDetailshigher = getTopper(arrayListStudent);
		Student stuDetailsLower = getLowerMarks(arrayListStudent);
		Student stuHighest = Collections.max(arrayListStudent, cmp);
		
		log.info("highest percentage using collection :->" + stuHighest);
		log.info("highest percentage:->" + stuDetailshigher);
		log.info("lowest percentage:->" + stuDetailsLower);
	}

	static Comparator<Student> cmp = (i, j) -> i.getPercentage().compareTo(j.getPercentage());

	static Student getTopper(ArrayList<Student> al) {

		Student maxValuePerc = al.stream().max(cmp).get();
		return maxValuePerc;
	}

	static Student getLowerMarks(ArrayList<Student> al) {

		Student maxValuePerc = al.stream().min(cmp).get();
		return maxValuePerc;
	}
}
