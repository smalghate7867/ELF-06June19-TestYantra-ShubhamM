package com.tyss.hibernateapp.storedprocedure;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tyss.hibernateapp.SessionFactoryUtil;

import lombok.extern.java.Log;

@Log
public class StoredProcedure {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSession();
		Session session = sessionFactory.openSession();
		StoredProcedureQuery procedure = session.createStoredProcedureCall("FetchAllEmpData");
		procedure.execute();
		List<Object[]> list = procedure.getResultList();
		for (Object[] object : list) {
			for (int i = 0; i < 13; i++) {
				System.out.println("data-->" + object[i]);
			}
			log.info("**************************************");

		}

	}
}
