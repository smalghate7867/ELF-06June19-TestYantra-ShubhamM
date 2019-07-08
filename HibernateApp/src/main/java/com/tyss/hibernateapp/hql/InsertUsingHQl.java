package com.tyss.hibernateapp.hql;

import java.sql.Time;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.SessionFactoryUtil;

import lombok.extern.java.Log;

@Log
public class InsertUsingHQl {
	public static void main(String[] args) throws InterruptedException {
		SessionFactory sesFact = SessionFactoryUtil.getSession();
		Session session = sesFact.openSession();
		String hql = "insert into NewEmployeeInfoBean(id,name,age,gender,salary,joiningDate,accountNo,email, "
				+ " designnation,dob,deptId,mngrId) select id,name,age,gender,salary,joiningDate,accountNo, "
				+ " email,designnation,dob,deptId,mngrId from EmployeeInfoBean where id=4 ";
		System.out.println("QUERIES :"+hql);
		Transaction tr = null;
		try {
		
			log.info("1");
			tr = session.beginTransaction();
			log.info("2");
			Query query = session.createQuery(hql);
			log.info("3");
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
