package com.tyss.hibernate.assessment;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactorySingleton {

	private static SessionFactory sessionFactory;

	private SessionFactorySingleton() {

	}

	public static SessionFactory getSession() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure().addAnnotatedClass(Customer.class).buildSessionFactory();

		}
		return sessionFactory;

	}
}
