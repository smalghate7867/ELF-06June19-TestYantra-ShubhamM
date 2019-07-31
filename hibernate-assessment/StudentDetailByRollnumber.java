package com.tyss.hibernate.assessment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import lombok.extern.java.Log;

@Log
public class StudentDetailByRollnumber {
	public static void main(String[] args) {
		SessionFactory sf = SessionFactorySingleton.getSession();
		Session session = sf.openSession();
		Query qry = session.createQuery("from Student where subject:a and rollno:b");
		qry.setParameter("a", "science");
		qry.setParameter("b", "101");

		Student stu = (Student) qry.uniqueResult();
		System.out.println(stu);
	}

}
