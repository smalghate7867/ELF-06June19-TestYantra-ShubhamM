package com.tyss.hibernate.assessment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import lombok.extern.java.Log;

@Log
public class StudentData {
	public static void main(String[] args) {
		SessionFactory sf=SessionFactorySingleton.getSession();
		Session session=sf.openSession();
		String hql="select firstName,totalMarks from Student";
		Query query=session.createQuery(hql);

		List<Student> data=query.list();
		for (Student string : data) {
			log.info("name"+string.getFirstName());
			log.info("marks"+string.getTotalMarks());
		}
	}

}
