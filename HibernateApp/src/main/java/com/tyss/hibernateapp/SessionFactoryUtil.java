package com.tyss.hibernateapp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author Administrator Singleton class for Session factory
 */
public class SessionFactoryUtil {

	private static SessionFactory sessionFactory;

	private SessionFactoryUtil() {}

	public static SessionFactory getSession() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();

		}
		return sessionFactory;

	}
}
