package com.tyss.hibernate.assessment;

import java.sql.Time;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.SessionFactoryUtil;

import lombok.extern.java.Log;

@Log
public class InsertUsingHql {
	public static void main(String[] args) throws InterruptedException {
		SessionFactory sesFact = SessionFactoryUtil.getSession();
		Session session = sesFact.openSession();
		String hql = "insert into Customer(firstName,lastName,contactNumber,address)"
				+ "select firstName,lastName,contactNumber,address from customerbean";
		System.out.println("QUERIES :" + hql);
		Transaction tr = null;
		try {
			tr = session.beginTransaction();
			Query query = session.createQuery(hql);
			int result = query.executeUpdate();
			tr.commit();
			log.info("INSERTED" + result);
		} catch (Exception e) {
			tr.rollback();
		} finally {
			session.close();
		}

	}
}
