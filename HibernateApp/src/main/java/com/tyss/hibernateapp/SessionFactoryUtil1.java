package com.tyss.hibernateapp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author Administrator Singleton class for Session factory
 */
public class SessionFactoryUtil1 {

	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionfactFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory Sesfact = cfg.buildSessionFactory();
		return Sesfact;

	}

	public static SessionFactory getSessionInfo() {
		if (sessionFactory == null) {
			// sessionFactory = new Configuration().configure().buildSessionFactory();
			sessionFactory = buildSessionfactFactory();
		}
		return sessionFactory;

	}
}
