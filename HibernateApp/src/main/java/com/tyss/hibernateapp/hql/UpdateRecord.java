package com.tyss.hibernateapp.hql;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.SessionFactoryUtil;

import lombok.extern.java.Log;

@Log
public class UpdateRecord {
	public static void main(String[] args) {
		Transaction tr = null;
		SessionFactory sesFact = SessionFactoryUtil.getSession();
		Session session = sesFact.openSession();

		String hqlUpdate = "update from EmployeeInfoBean set name=:nm,salary=:sal where id=:eid";
		Query query = session.createQuery(hqlUpdate);
		query.setParameter("eid", 1);
		query.setParameter("nm", "Shubham");
		query.setParameter("sal", 9999999.00);


		try {
			tr = session.beginTransaction();
			int updateresult = query.executeUpdate();
			log.info("Updated*: " + updateresult);
			tr.commit();

		} catch (Exception e) {
			tr.rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
