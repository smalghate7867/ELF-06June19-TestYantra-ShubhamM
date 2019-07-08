package com.tyss.hibernateapp.hql;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.SessionFactoryUtil;

import lombok.extern.java.Log;

@Log
public class DeleteRecord {
	public static void main(String[] args) {
		Transaction tr=null;
		SessionFactory sesFact = SessionFactoryUtil.getSession();
		Session session = sesFact.openSession();
		
		String hqlDelete = "delete from EmployeeInfoBean where id=:eid";
		
		Query query = session.createQuery(hqlDelete);
		query.setParameter("eid", 4);
		try {
			tr=session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Deleted*: "+result);
			tr.commit();
			
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
	}
}
